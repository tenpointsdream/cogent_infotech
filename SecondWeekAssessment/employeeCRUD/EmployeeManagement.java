package employeeCRUD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmployeeManagement {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();
		int choice = 0;
		int id = 0;
		do {
			System.out.println("*************MENU***************");
			System.out.println("1-Add employee");
			System.out.println("2-Show employees");
			System.out.println("3-Search employee");
			System.out.println("4-Update employee information");
			System.out.println("5-Delete employee");
			System.out.println("6-Sort all employees");
			System.out.println("7-Exit");
			System.out.println("Please enter your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				int number = 0;
				int i = 0;
				System.out.println("How many employees would you like to add?");
				number = sc.nextInt();
				while (i < number) {
					System.out.println("Enter employee ID: ");
					id = sc.nextInt();
					System.out.println("Enter employee Name:");
					String name = sc.next();
					System.out.println("Enter employee Adress: ");
					String address = sc.next();
					System.out.println("Enter employee Email: ");
					String email = sc.next();
					System.out.println("Enter employee Salary: ");
					float salary = sc.nextFloat();
					employeeDAO.create(employees, new Employee(id, name, address, email, salary));
					i++;
				}
				break;
			case 2:
				employeeDAO.readAll(employees);
				break;
			case 3:
				System.out.println("Enter the ID to search employee: ");
				employeeDAO.search(employees, sc.nextInt());
				break;
			case 4:
				System.out.println("What is the ID of the Employee you want to update? ");
				employeeDAO.update(employees, sc.nextInt());
				break;
			case 5:
				System.out.println("What is the ID of the Employee you want to remove? ");
				employeeDAO.delete(employees, sc.nextInt());
				break;
			case 6:
				employeeDAO.sort(employees);
				break;
			case 7:
				System.exit(0);
			System.out.println();
			}
		} while (choice != 7);
		sc.close();
	}
}
