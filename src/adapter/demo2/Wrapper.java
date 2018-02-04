package adapter.demo2;

import adapter.Source;
import adapter.Targetable;

public class Wrapper implements Targetable {

	private Source source;
	
	public Wrapper(Source source) {
		this.source = source;
	}
	
	public void method1() {
		source.method1();
	}
	
	public void method2() {
		System.out.println("this is Wrapper method2");
	}
}
