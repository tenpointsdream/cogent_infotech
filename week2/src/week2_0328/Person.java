package week2_0328;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Person implements Serializable{
	int age;
	int rollNo;
	String name;
	String address;
	public Person(int age, int rollNo, String name, String address) {
		super();
		this.age = age;
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	
}
