package factory.simple;

import factory.Audi;
import factory.Benz;
import factory.Car;

public class SimpleFactory {

	public Car getCar(String name) {
		if ("Benz".equalsIgnoreCase(name)) {
			return new Benz();
		} else if ("Audi".equalsIgnoreCase(name)) {
			return new Audi();
		} else {
			System.out.println("无法生产");
			return null;
		}
		
	}
}
