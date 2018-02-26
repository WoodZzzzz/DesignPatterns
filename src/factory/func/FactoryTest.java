package factory.func;

public class FactoryTest {

	public static void main(String[] args) {
		Factory factory = new AudiFactory();
		System.out.println(factory.getCar());
		
		factory = new BenzFactory();
		System.out.println(factory.getCar());
	}
}
