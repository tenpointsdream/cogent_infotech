package week2_0329;

public class SychronizationDemo {

	public static void main(String[] args) {
		DisplayMessage dm = new DisplayMessage();
		MyThread t1 = new MyThread(dm, "Khoa?");
		MyThread t2 = new MyThread(dm, "Shovel?");
		t1.start();
		t2.start();
	}

}
