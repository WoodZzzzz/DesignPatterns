package factory.abstr;

import factory.Car;

public class DefaultFactory extends AbstractFactory {

	private AudiFactory defaultFactory = new AudiFactory();
	
	@Override
	public Car getCar() {
		return defaultFactory.getCar();
	}

}
