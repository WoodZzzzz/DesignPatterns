package singleton;

/**
 * 
 * @描述: 一般的单例模式，缺点：不使用的时候就加载了，比较消耗内存资源
 * @版权: Copyright (c) 2018  
 * @作者: zwj
 * @创建日期: 2018年1月30日 下午9:14:06
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
