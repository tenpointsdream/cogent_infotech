package week2_a2;

import java.util.Scanner;

@SuppressWarnings("serial")
class LowSalException extends Exception{
	LowSalException(String message) {
		super(message);
	}
}
public class Emp {

	int empId;
	String empName;
	String designation;
	double basic;
	final double hra;
	public Emp(int empId, String empName, String designation, double basic) throws LowSalException{
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		if (basic < 500) 
				throw new LowSalException("This person's salary is too low");
		else {
			this.basic = basic;
			hra = calculateHRA();
		}
	}
	void printDET(){
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Designation: " + designation);
		System.out.println("Employee Basic: " + basic);
		System.out.println("Employee HRA: " + hra);
	}
	 double calculateHRA() {
		if (designation.equals("Manager"))
			return 0.1 * basic;
		else if (designation.equals("Officer"))
			return 0.12 * basic;
		else if (designation.equals("Clerk"))
			return  0.05 * basic;
		else 
			return hra;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee ID: ");
		int id = sc.nextInt();
		System.out.println("Enter employee Name: ");
		String name = sc.next();
		System.out.println("Enter Designation: ");
		String desi = sc.next();
		System.out.println("Enter Basic: ");
		double basic = sc.nextDouble();
		
		try {
			Emp e = new Emp(id, name, desi, basic);
			e.printDET();
		}
		catch (LowSalException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
