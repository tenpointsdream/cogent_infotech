package check.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("check/spring/config.xml");
		Prescription p = (Prescription) ctx.getBean("prescription");
		System.out.println(p);
	}
}
