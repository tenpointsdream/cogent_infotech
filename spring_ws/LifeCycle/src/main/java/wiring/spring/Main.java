package wiring.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("wiring/spring/config.xml");
		Person p = (Person) ctx.getBean("person");
		Car car = p.getCar();
		Address address = p.getAddress();
		System.out.println("-----------Address-----------");
		System.out.println("House #: " + address.getHouseNo());
		System.out.println("Street name: " +address.getStreet());
		System.out.println("City name: " + address.getCity());
		System.out.println("-----------Car-------------");
		System.out.println("Car model: " + car.getModel());
		System.out.println("Car price: " + car.getPrice());
	}

}
