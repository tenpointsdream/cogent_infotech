package pkg.java8;
@FunctionalInterface
public interface Interface1 {
	//SAM-Single Abstract Method
	public void m1();
	
	default void m2() {
		System.out.println("This is m2");
	}
	
	public static void m3() {
		System.out.println("This is m3");
	}
	
	// public void m4();
}
