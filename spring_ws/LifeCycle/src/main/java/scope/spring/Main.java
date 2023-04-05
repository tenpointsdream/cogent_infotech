package scope.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("scope/spring/config.xml");
		University u1 = (University) ctx.getBean("university");
		University u2 = (University) ctx.getBean("university");
		System.out.println(u1.hashCode());
		System.out.println(u2.hashCode());
	}
}
