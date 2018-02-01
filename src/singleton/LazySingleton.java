package singleton;

/**
 * 
 * @����: �ӳټ��صĵ���ģʽ�����Ǻ�ʱ����
 * @��Ȩ: Copyright (c) 2018  
 * @����: zwj
 * @��������: 2018��1��30�� ����9:46:06
 */
public class LazySingleton implements Runnable {
	
	private static LazySingleton instance = null;
	
	private LazySingleton() {
		System.out.println("LazySingleton is created");
	}
	/**
	 * 
	 * @�������˷�����ɵ��������ڻ�ȡʵ����ʱ��Ч�ʵ��£� ���Խ���ȡ�̷߳����������
	 * @���ߣ�Zhouwj
	 * @ʱ�䣺2018��2��1�� ����11:26:25
	 * @return
	 * LazySingleton
	 */
	public static synchronized LazySingleton getInstance() {
		/*if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;*/
		if (instance == null) {
			synchronized (LazySingleton.class) {
				instance = new LazySingleton();
			}
		}
		return instance;
		
	}

	public void run() {
		long beginTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			LazySingleton.getInstance();
		}
		System.out.println(System.currentTimeMillis() - beginTime);
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new Thread(new LazySingleton()).start();
		}
	}
	
}
