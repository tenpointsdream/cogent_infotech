package week2_0330;

import java.util.Scanner;

public class TestHashMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.println("How many students would you like to add?");
		int number = sc.nextInt();
		for (int i = 0; i < number; i++)
			student.setNames();
		student.printName();
		
		System.out.println("Enter the key to find the student: ");
		student.getName(sc.nextInt());
		
		student.printNamesKeySet();
		student.printSize();
		System.out.println("Enter the key to remove the student: ");
		student.remove(sc.nextInt());
		student.printName();
		sc.close();
	}
}
