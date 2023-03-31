package employeeCRUD;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class EmployeeDAOImpl implements EmployeeDAO{
	Scanner sc = new Scanner(System.in);

	@Override
	public void create(List<Employee> employees, Employee employee) {
		employees.add(employee);
	}

	@Override
	public void readAll(List<Employee> employees) {
		if (employees.size() == 0) {
			System.out.println("No book in the list!");
			return;
		}
		Iterator<Employee> itr = employees.iterator();
		while (itr.hasNext()) {
			Employee e =  itr.next();
			System.out.println();
			System.out.println("Employee ID: " + e.getEmployeeNo());
			System.out.println("Employee Name: " + e.getEmployeeName());
			System.out.println("Employee Address: " + e.getEmployeeAddress());
			System.out.println("Employee Email: $" + e.getEmployeeEmail());
			System.out.println("Employee Salary: " + e.getEmployeeSalary());
		}
	}

	@Override
	public void search(List<Employee> employees, int id) {
		if (employees.size() == 0) {
			System.out.println("No employee in the list!");
			return;
		}
		boolean found = false;
		Iterator<Employee> itr = employees.iterator();
		while (itr.hasNext()) {
			Employee e =itr.next();
			if (e.getEmployeeNo() == id) {
				found = true;
				System.out.println("Found employee with ID: " + id);
				System.out.println("Employee Name: " + e.getEmployeeName());
				System.out.println("Employee Address: " + e.getEmployeeAddress());
				System.out.println("Employee Email: $" + e.getEmployeeEmail());
				System.out.println("Employee Salary: " + e.getEmployeeSalary());
			}
		}
		if (!found)
			System.out.println("No employee with ID [" + id + "] found");
	}

	@Override
	public void update(List<Employee> employees, int id) {
		if (employees.size() == 0) {
			System.out.println("No employee in the list!");
			return;
		}
		int choice = 0;
		boolean found = false;
		Iterator<Employee> itr = employees.iterator();
		while (itr.hasNext()) {
			Employee e = itr.next();
			if (e.getEmployeeNo() == id) {
				do {
					found = true;
					System.out.println("1-Update name");
					System.out.println("2-Update address");
					System.out.println("3-Update email");
					System.out.println("4-Update salary");
					System.out.println("5-Exit updating");
					System.out.println("Which option would you like?");
					switch (choice = sc.nextInt()) {
					case 1:
						System.out.println("Enter new name: ");
						e.setEmployeeName(sc.next());
						break;
					case 2:
						System.out.println("Enter address: ");
						e.setEmployeeAddress(sc.next());
						break;
					case 3:
						System.out.println("Enter new email: ");
						e.setEmployeeEmail(sc.next());
						break;
					case 4: 
						System.out.println("Enter new salary: ");
						e.setEmployeeSalary(sc.nextFloat());
					case 5:
						break;
					}
				} while (choice != 5);
			}
		}
		if (!found)
			System.out.println("No employee with ID [" + id + "] found");
	}

	@Override
	public void delete(List<Employee> employees, int id) {
		if (employees.size() == 0) {
			System.out.println("No employee in the list!");
			return;
		}
		boolean found = false;
		int i;
		for (i = 0; i < employees.size(); i++) {
			Employee e = employees.get(i);
			if (e.getEmployeeNo() == id) {
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("No employee with ID [" + id + "] found");
			return;
		}
		System.out.println("Are you sure? (yes/no)");
		if (sc.next().equals("yes")) {
			employees.remove(i);
			System.out.println("Book with ID [" + id + "] is removed!");
		} else {
			System.out.println("Exiting deleting book!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void sort(List<Employee> employees) {
		Collections.sort(employees, new EmployeeComparator());
		System.out.println("All employee after sorting:");
		this.readAll(employees);
	}

}
