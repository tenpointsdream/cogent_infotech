package week2_0328;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("serial")
class EmptyField extends Exception {
	EmptyField(String message) {
		super(message);
	}
}

public class PersonSerialization {

	public void checkEmptyField(String a) throws EmptyField {
		if (a.equals(""))
			throw new EmptyField("Field is empty");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Person> pal = new ArrayList<>();
		int choice = 0;
		do {
			String name = "";
			System.out.println("Enter Name: ");
			try {
				name = sc.nextLine();
				new PersonSerialization().checkEmptyField(name);
			} catch (EmptyField e) {
				System.err.println(e.getMessage());
			}
			String a = "";
			System.out.println("Enter Age: ");
			int age = 0;
			try {
				a = sc.nextLine();
				new PersonSerialization().checkEmptyField(a);
				Integer aa = Integer.parseInt(a);
				age = aa.intValue();
			} catch (EmptyField e) {
				System.err.println(e.getMessage());
			}

			String r = "";
			int rollNo = 0;
			System.out.println("Enter Roll Number: ");
			try {
				r = sc.nextLine();
				new PersonSerialization().checkEmptyField(a);
				Integer rr = Integer.parseInt(r);
				rollNo = rr.intValue();
			} catch (EmptyField e) {
				System.err.println(e.getMessage());
			}

			String addr = "";
			System.out.println("Enter address");
			try {
				addr = sc.nextLine();
				new PersonSerialization().checkEmptyField(a);
			} catch (EmptyField e) {
				System.err.println(e.getMessage());
			}
			FileOutputStream fos;
			ObjectOutputStream oos;
			System.out.println("Would you like to save this person into the Person.ser file? (yes/no)");
			if (sc.next().equals("yes")) {
				try {
					pal.add(new Person(age, rollNo, name, addr));
					fos = new FileOutputStream("c://java_ws//week2//src//week2_0328//Person.ser");
					oos = new ObjectOutputStream(fos);
					oos.writeObject(pal);
					System.out.println("Object is saved to the file!");
					fos.close();
					oos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("Would you like to enter another person? (1: yes/0: no)");
			choice = sc.nextInt();
			sc.nextLine();
		} while (choice != 0);
		sc.close();
	}

}
