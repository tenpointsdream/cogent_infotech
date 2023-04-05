package lifecycle3.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("lifecycle3/spring/config.xml");
		Patient p = (Patient) ctx.getBean("patient");
		System.out.println(p);
		ctx.registerShutdownHook();
		ctx.close();
	}

}
