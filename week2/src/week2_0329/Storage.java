package week2_0329;

public class Storage {
	int count;
	boolean produced = false;

	public synchronized int getCount() {
		while (!produced)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Storage value: " + count);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		produced = false;
		notify();
		return count;
	}

	public synchronized void setCount(int count) {
		if (produced)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		this.count = count;
		produced = true;
		System.out.println("Setting new value to Storage: " + count);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notify();
	}

}
