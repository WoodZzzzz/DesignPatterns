package singleton;

/**
 * 
 * @描述: 延迟加载的单例模式，但是耗时更多
 * @版权: Copyright (c) 2018  
 * @作者: zwj
 * @创建日期: 2018年1月30日 下午9:46:06
 */
public class LazySingleton implements Runnable {
	
	private static LazySingleton instance = null;
	
	private LazySingleton() {
		System.out.println("LazySingleton is created");
	}
	/**
	 * 
	 * @描述：此方法造成的问题是在获取实例的时候效率低下， 可以将获取线程方法抽离出来
	 * @作者：Zhouwj
	 * @时间：2018年2月1日 上午11:26:25
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
