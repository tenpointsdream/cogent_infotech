package autowiring_annotation.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

	private Car car;

	@Autowired
	public Person(Car car) {
		super();
		this.car = car;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
