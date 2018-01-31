package singleton;

/**
 * 
 * @����: �ӳټ��صĵ���ģʽ�����Ǻ�ʱ����
 * @��Ȩ: Copyright (c) 2018  
 * @����: zwj
 * @��������: 2018��1��30�� ����9:46:06
 */
public class LazySingleton implements Runnable {
	
	public static LazySingleton instance = null;
	
	private LazySingleton() {
		System.out.println("LazySingleton is created");
	}
	
	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
	
	public void run() {
		long beginTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			LazySingleton.getInstance();
		}
		System.out.println(System.currentTimeMillis() - beginTime);
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			new Thread(new LazySingleton()).start();
		}
	}
	
}
