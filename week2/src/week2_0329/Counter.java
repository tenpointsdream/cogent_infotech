package week2_0329;

public class Counter extends Thread{
	Storage s;
	Counter(Storage s){
		this.s = s;
	}
	@Override
	public void run() {
		int i = 0;
		while(true)
			s.setCount(i++);
	}
}
