package sorting;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		Set<Employee> set = new TreeSet<>(new EmployeeNameComparator());
		set.add(new Employee(100, "Patrick"));
		set.add(new Employee(400, "Jerry"));
		set.add(new Employee(300, "Tom"));
		set.add(new Employee(200, "Star"));
		
		for (Employee employee: set) {
			System.out.println(employee.id);
			System.out.println(employee.name);
		}
//		Set<Person> set = new TreeSet<>(new PersonNameComparator());
//		set.add(new Person(100, "Patrick"));
//		set.add(new Person(400, "Jerry"));
//		set.add(new Person(300, "Tom"));
//		set.add(new Person(200, "Star"));
//		
//		for (Person person : set) {
//			System.out.println(person.id);
//			System.out.println(person.name);
//		}
	}
}
