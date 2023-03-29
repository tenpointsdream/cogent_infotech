package week2_0329;

public class Main {

	public static void main(String[] args) {
		Display d = new Display();
		YourThread yt1 = new YourThread(d, "Khoa");
		YourThread yt2 = new YourThread(d, "Steven");
		yt1.start();
		yt2.start();
	}

}
