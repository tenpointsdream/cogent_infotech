package qualifier.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("qualifier/spring/config.xml");
		Employee e = (Employee) ctx.getBean("employee");
		System.out.println(e);
	}
}
