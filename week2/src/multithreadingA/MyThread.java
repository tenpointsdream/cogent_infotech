package multithreadingA;

public class MyThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 25; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
	}
}

//public class MyThread implements Runnable{
//	@Override
//	public void run() {
//		for (int i = 0; i < 25; i++) {
//			System.out.println(Thread.currentThread().getName() + ": " + i);
//		}
//	}
//}