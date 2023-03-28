package serialization;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Employee implements Serializable{

	int empId;
	String name;
	double salary;
	int ssn;
	public Employee(int empId, String name, double salary, int ssn) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.ssn = ssn;
	}
	
}
