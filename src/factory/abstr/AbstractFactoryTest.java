package factory.abstr;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		DefaultFactory factory = new DefaultFactory();
		factory.getCar();
		
		System.out.println(factory.getCar("benz"));
		System.out.println(factory.getCar("audi"));
	}
}
