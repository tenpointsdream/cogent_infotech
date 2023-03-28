package multithreadingA;

public class ThreadDemo {
	public static void main(String[] args) {
//		MyThread t1 = new MyThread();
//		MyThread t2 = new MyThread();
//		t1.setName("First Thread: ");
//		t2.setName("Second thread: ");
//		t1.setPriority(Thread.MAX_PRIORITY);
//		t2.setPriority(Thread.MIN_PRIORITY);
//		t1.start();
//		t2.start();
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t2);
		tt1.setPriority(Thread.MAX_PRIORITY);
		tt2.setPriority(Thread.MIN_PRIORITY);
		tt1.start();
		tt2.start();
	}
}
