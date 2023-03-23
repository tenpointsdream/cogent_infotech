package pkg;
import java.util.Scanner;

public class TestRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle rect[] = new Rectangle[5];
		for (int i = 0; i < rect.length; i++) {
			Rectangle r = new Rectangle();
			System.out.println("Enter length: ");
			r.setLength(sc.nextFloat());
			System.out.println("Enter width: ");
			r.setBreadth(sc.nextFloat());
			rect[i] = r;
			rect[i].calcArea();
		}
		
		for (Rectangle r: rect) {
			r.display();
		}
		sc.close();
	}

}
