package singleton;

import java.util.HashMap;
import java.util.Map;

public class ThreeSingleton implements Runnable {

	private final static String DEFAULT_PREKEY = "cache";
	private final static int MAX_NUM = 3;
	private static Map<String, ThreeSingleton> map = new HashMap<String, ThreeSingleton>();
	private static int number = 1;

	private ThreeSingleton() {
	}

	public static synchronized ThreeSingleton getInstance() {
		String key = DEFAULT_PREKEY + number;
		ThreeSingleton threeSingleton = map.get(key);
		if (threeSingleton == null) {
			threeSingleton = new ThreeSingleton();
			map.put(key, threeSingleton);
		}
		number++;
		if (number > MAX_NUM) {
			number = 1;
		}
		return threeSingleton;
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}
}
