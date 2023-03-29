package pkg;

public class Main {

	public static void main(String[] args) throws InterruptedException{
		MyThread t1 = new MyThread();
		t1.start();
		synchronized(t1) {
			System.out.println("Main thread is going to wait...");
			t1.wait();
			Thread.sleep(1000);
			System.out.println("Main thread notified");
			Thread.sleep(1000);
			System.out.println(t1.total);
		}
	}

}
