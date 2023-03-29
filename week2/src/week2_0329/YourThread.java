package week2_0329;

public class YourThread extends Thread{
	Display d;
	String name;
	public YourThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	
	@Override
	public void run() {
		d.displaySomething(name);
	}
}
