package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("c://java_ws//stream//Emp.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			Employee emp = (Employee) obj;
			System.out.println("Employee ID: " + emp.empId);
			System.out.println("Employee Name: " + emp.name);
			System.out.println("Employee Salary: " + emp.salary);
			System.out.println("Employee SSN: " + emp.ssn);
			fis.close();
			ois.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
