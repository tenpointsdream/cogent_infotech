package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream("c://java_ws//stream//Emp.ser");
			oos = new ObjectOutputStream(fos);
			Employee e1 = new Employee(1, "Khoa", 10000.99, 123456789);
			oos.writeObject(e1);
			System.out.println("Object serialized");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
