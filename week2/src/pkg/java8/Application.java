package pkg.java8;

interface InterfaceMe {
	public void sum(int a, int b);
}
//
//class MyClass implements InterfaceMe {
//
//	@Override
//	public int sum(int a, int b) {
//		// TODO Auto-generated method stub
//		return a + b;
//	}
//
//}
interface I1{
	int square(int x);
}

interface I2{
	int lString(String s);
}
public class Application {

	public static void main(String[] args) {
//		MyClass a = new MyClass();
//		int x = a.sum(100, 200);
//		System.out.println("Sum is: " + x);
//		InterfaceMe mi = (a, b) -> {
//			System.out.println((a + b));
//		};
//		mi.sum(100, 200);
		
		//I1 it1 = (s)-> s*s;
		//System.out.println("Square of 100: " +it1.square(100));

		I2 it2 = (s)->s.length();
		System.out.println("Length of string: " + it2.lString("Hello there! There is nothing to show here!"));
	}
}
//Functional interface	Return type		Method		#of parameters
//Predicate<T>			boolean			test(T)		1(T)
//Supplier<T>			T				get()		0
//Consumer<T>			void			accept(T)	1(T)
//Functional<R, T>		R				apply(T)	1(T)