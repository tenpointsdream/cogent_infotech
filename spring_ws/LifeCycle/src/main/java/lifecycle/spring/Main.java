package lifecycle.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("lifecycle/spring/config.xml");
		Employee e = (Employee) ctx.getBean("employee");
		System.out.println("Employee ID: " + e.getEmp_id());
		System.out.println("Employee Name: " + e.getEmp_name());
		System.out.println("Employee Address: " + e.getEmp_address());
		System.out.println("Employee Salary: " + e.getEmp_salary());
		ctx.registerShutdownHook();
		
		ctx.close();
	}
}
