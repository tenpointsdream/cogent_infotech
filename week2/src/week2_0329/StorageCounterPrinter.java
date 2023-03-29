package week2_0329;

public class StorageCounterPrinter {

	public static void main(String[] args) {
		Storage s = new Storage();
		Counter c = new Counter(s);
		Printer p = new Printer(s);
		c.start();
		p.start();
		
		
	}

}
