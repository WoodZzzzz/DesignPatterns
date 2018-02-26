package decorator;

public class Decorator implements Parent {

	private Parent p;
	
	public Decorator(Parent p) {
		this.p = p;
	}
	
	public void method() {
		System.out.println("before method ");
		p.method();
		System.out.println("after method");
	}
}
