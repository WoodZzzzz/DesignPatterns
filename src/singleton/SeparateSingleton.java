package singleton;

public class SeparateSingleton implements Runnable {

	private static SeparateSingleton instance = null;
	
	private SeparateSingleton() {
	}
	
	public static SeparateSingleton getInstance() {
		if (instance == null) {
			syncInit();
		}
		return instance;
	}

	private synchronized static void syncInit() {
		if (instance == null) {
			instance = new SeparateSingleton();
		}
	}
	
	public void run() {
		long beginTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			SeparateSingleton.getInstance();
		}
		System.out.println(System.currentTimeMillis() - beginTime);
	}
	
	public static void main(String[] args) {
		for (int i = 0 ;i < 5; i++) {
			new Thread(new SeparateSingleton()).start();
		}
	}
}
