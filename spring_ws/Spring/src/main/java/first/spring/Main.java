package first.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Greeting greeting = (Greeting) ctx.getBean("hello");
		String str = greeting.message();
		Employee employee = (Employee) ctx.getBean("emp");
		System.out.println(str);
		System.out.println("Employee number: " + employee.getId());
		System.out.println("Employee name: " + employee.getName());
		Person person = (Person) ctx.getBean("person");
//		Person person = (Person) ctx.getBean(Person.class);		//This actually works 
		System.out.println("\nPerson id: " + person.getId());
		System.out.println("Person name: " + person.getName());
		System.out.println("Person age: " + person.getAge());
		Hospital hospital = (Hospital) ctx.getBean("hospital");
		System.out.println("\nHospital name: " + hospital.getName());
		List<String> department = hospital.getDepartment();
		System.out.print("Departments of this hospital: ");
		for (String string : department) {
			System.out.print(string + ", ");
		}
		System.out.println("\n" + hospital.getDepartment().getClass());
		Customer customer = (Customer) ctx.getBean("customer");
		System.out.println("\nCustomer ID: " + customer.getId());
		Map<Integer, String> product = customer.getProduct();
		Set<Integer> ks = product.keySet();
		for (Integer integer : ks) {
			System.out.println("Key: " + integer + "\t-->Product: " + product.get(integer));
		}
		CarDealer c = (CarDealer) ctx.getBean(CarDealer.class);
		Set<String> models = c.getModels();
		System.out.println(models);
		for (String m : models) {
			System.out.print(m + "-");
		}
		System.out.println();

		Student student = (Student) ctx.getBean(Student.class);
		System.out.println(student);
		ctx.close();
	}

}
