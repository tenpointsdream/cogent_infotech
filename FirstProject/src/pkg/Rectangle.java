package pkg;

public class Rectangle {
	float length;
	float breadth;
	float area;
	public Rectangle() {
		length = 0;
		breadth = 0;
		area = 0;
	}
	
	public Rectangle(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	
	public void calcArea() {
		area = length * breadth;
	}
	public void display() {
		System.out.println("Rectangle:\nLength: " + length + "\nWidth: " +breadth+ "\nArea: " + area);
	}
	
}
