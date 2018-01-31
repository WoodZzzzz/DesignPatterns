package singleton;

/**
 * 
 * @����: һ��ĵ���ģʽ��ȱ�㣺��ʹ�õ�ʱ��ͼ����ˣ��Ƚ������ڴ���Դ
 * @��Ȩ: Copyright (c) 2018  
 * @����: zwj
 * @��������: 2018��1��30�� ����9:14:06
 */
public class Singleton implements Runnable {

	private static Singleton singleton = new Singleton();
	
	private Singleton()	 {
		System.out.println("Singleton is created");
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
	
	public void run() {
		long beginTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			Singleton.getInstance();
		}
		System.out.println(System.currentTimeMillis() - beginTime);
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			new Thread(new Singleton()).start();
		}
	}
}
