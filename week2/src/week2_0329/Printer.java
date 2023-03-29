package week2_0329;

public class Printer extends Thread{
	Storage s;
	Printer(Storage s){
		this.s = s;
	}
	@Override
	public  void run() {
		while(true) {
			s.getCount();
		}
	}
}
