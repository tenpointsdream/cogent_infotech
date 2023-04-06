package spring_jdbc.employee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_jdbc.employee.dao.EmployeeDAO;
import spring_jdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_jdbc/employee/test/config.xml");
		EmployeeDAO dao = (EmployeeDAO) ctx.getBean("employeeDAO");
		Employee emp = new Employee(1001, "No", "Ho");
		int i = dao.update(emp);
//		int i = dao.delete(1001);
		if (i > 0)
			System.out.println("Rows updated: " + i);
		else
			System.out.println("Failed to create new record");

	}
}
