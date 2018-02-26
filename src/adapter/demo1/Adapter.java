package adapter.demo1;

import adapter.Source;
import adapter.Targetable;


public class Adapter extends Source implements Targetable {

	public void method2() {
		System.out.println("this is Adapter's method2");
	}
}
