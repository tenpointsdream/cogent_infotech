package innerbean.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("innerbean/spring/config.xml");
		Employee e1 = (Employee) ctx.getBean("employee");
		System.out.println(e1.hashCode());
		Employee e2 = (Employee) ctx.getBean("employee");
		System.out.println(e2.hashCode());
//		same object, default singleton scope
//		different objects, prototype scope
		System.out.println(e1);
	}

}
