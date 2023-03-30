package week2_033023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudnetSortDemo {

	public static void main(String[] args) {
		List<Student> student = new ArrayList<>();
		student.add(new Student(100, "Khoa"));
		student.add(new Student(300, "Jack"));
		student.add(new Student(500, "Arby"));
		student.add(new Student(400, "Wiston"));
		student.add(new Student(200, "Cicada"));
		for (Student student2 : student) {
			System.out.println(student2);
		}
		
		//Collections.sort(student);
		Collections.sort(student, new StudentComparator());
		System.out.println("\nAfter sorting");
		for (Student student2 : student) {
			System.out.println(student2);
		}
	}
}
