package factory.abstr;

import factory.Benz;
import factory.Car;

public class BenzFactory extends AbstractFactory {

	public Car getCar() {
		return new Benz();
	}

}
