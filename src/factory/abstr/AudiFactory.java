package factory.abstr;

import factory.Audi;
import factory.Car;

public class AudiFactory extends AbstractFactory{

	public Car getCar() {
		return new Audi();
	}
}
