package week2_033023;

public class Student /* implements Comparable<Student> */{

	private int rollNo;
	private String name;

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//	@Override
//	public int compareTo(Student o) {
//		return this.name.compareTo(o.name);
//	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Roll number: " + rollNo + "\tName: " + name;
	}
}
