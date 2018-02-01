package adapter.demo3;

import adapter.Targetable;

public class WrapperTest {

	public static void main(String[] args) {
		Targetable t1 = new TargetSub1();
		Targetable t2 = new TargetSub2();
		t1.method1();
		t2.method2();
	}
}
