package pkg.java8;

interface MyInterface{
	void m1();
	void m2();
	void m3();
	default void m4() {
		System.out.println("I'm inside m4");
	}
	static void m5() {
		new A().m4();
		System.out.println("I'm inside m5");
	}
}

class A implements MyInterface{

	@Override
	public void m1() {
		System.out.println("A: I'm inside m1");
	}

	@Override
	public void m2() {
		System.out.println("A: I'm inside m2");
	}

	@Override
	public void m3() {
		System.out.println("A: I'm inside m3");
	}
	
}

class B implements MyInterface{

	@Override
	public void m1() {
		System.out.println("B: I'm inside m1");
	}

	@Override
	public void m2() {
		System.out.println("B: I'm inside m2");
	}

	@Override
	public void m3() {
		System.out.println("B: I'm inside m3");
	}
	
}
public class Main{

	public static void main(String[] args) {
		//MyInterface a = new A();
		//B b = new B();
		//a.m4();
		//b.m4();
		MyInterface.m5(); //valid
		//m5(); //invalid
		//Main m = new Main();
		//m.m5(); //invalid
	}
}
