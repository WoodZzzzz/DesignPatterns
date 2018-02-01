package adapter.demo2;

import adapter.Targetable;

public class WrapperTest {

	public static void main(String[] args) {
		Source source = new Source();
		Targetable t = new Wrapper(source);
		t.method1();
		t.method2();
	}
}
