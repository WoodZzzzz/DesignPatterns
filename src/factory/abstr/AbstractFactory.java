package factory.abstr;

import factory.Car;

public abstract class AbstractFactory {

	abstract Car getCar();
	
	public Car getCar(String name) {
		if ("Benz".equalsIgnoreCase(name)) {
			return new BenzFactory().getCar();
		} else if ("Audi".equalsIgnoreCase(name)) {
			return new AudiFactory().getCar();
		} else {
			System.out.println("无法生产");
			return null;
		}
	}
}
