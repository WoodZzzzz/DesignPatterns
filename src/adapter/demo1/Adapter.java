package adapter.demo1;

import adapter.Targetable;
import adapter.demo2.Source;


public class Adapter extends Source implements Targetable {

	public void method2() {
		System.out.println("this is Adapter's method2");
	}
}
