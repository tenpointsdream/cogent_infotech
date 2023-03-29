package week2_0329;

public class Display {

	public synchronized void displaySomething(String name) {
		for (int i = 0; i <= 5; i++) {
			System.out.println("There is nothing to display, " + name + "!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
