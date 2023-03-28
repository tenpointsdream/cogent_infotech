package week2_0328;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class PersonDeserialization {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		
		ArrayList<Person> pal = new ArrayList<>();
		try {
			FileInputStream fis = new FileInputStream("c://java_ws//week2//src//week2_0328//Person.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			pal = (ArrayList<Person>) ois.readObject();
			fis.close();
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < pal.size(); i++) {
			System.out.println("Name: " + pal.get(i).name);
			System.out.println("Age: " + pal.get(i).age);
			System.out.println("Roll-Number: " + pal.get(i).rollNo);
			System.out.println("Address: " + pal.get(i).address + "\n");
		}
			
	}
}
