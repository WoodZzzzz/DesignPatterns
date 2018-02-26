package singleton;

/**
 * 
 * @描述: 解决同步关键字低效率问题
 * @版权: Copyright (c) 2018  
 * @作者: zwj
 * @创建日期: 2018年1月31日 下午4:42:56
 */
public class StaticSingleton implements Runnable {

	private StaticSingleton() {
		System.out.println("StaticSingleton is created");
	}
	
	private static class SingletonHolder {
		private static final StaticSingleton instance = new StaticSingleton();
	}
	
	public static final StaticSingleton getInstance() {
		return SingletonHolder.instance;
	}
	
	public void run() {
		long beginTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			StaticSingleton.getInstance();
		}
		System.out.println(System.currentTimeMillis() - beginTime);
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new Thread(new StaticSingleton(), "Thread--" + i).start();
		}
		
		
	}
	
	
}
