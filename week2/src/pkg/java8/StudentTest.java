package pkg.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student(1, "class4", "John");
		Student s2 = new Student(2, "class5", "Tom");
		Predicate<Student> p = (s)->s.getRollNo()==2;
		List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		for (Student student : students) {
			if (p.test(student)) {
				System.out.println("Student roll number: " + student.getRollNo());
				System.out.println("Student class name: " + student.getClassName());
				System.out.println("Student name: " + student.getName());
			}
		}
	}
}
