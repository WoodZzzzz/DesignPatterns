package singleton;

/**
 * 
 * @描述: 延迟加载的单例模式，但是耗时更多
 * @版权: Copyright (c) 2018  
 * @作者: zwj
 * @创建日期: 2018年1月30日 下午9:46:06
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
