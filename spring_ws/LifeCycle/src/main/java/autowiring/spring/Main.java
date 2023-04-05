package autowiring.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("autowiring/spring/config.xml");
		Customer c = (Customer) ctx.getBean("customer");
		Reservation reservation = c.getReservation();
		System.out.println("Customer name: " + c.getName());
		System.out.println("Reservation ID: " + reservation.getId());
		System.out.println("Reservation time: " + reservation.getTime());
	}
}
