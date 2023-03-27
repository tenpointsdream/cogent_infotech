package week2;

import java.util.Scanner;

class IllegalArgumentException extends Exception{
	IllegalArgumentException(String message){
		super(message);
	}
}
public class CalcAverage {

	public double avgFirstN(int N) throws IllegalArgumentException {
		if (N <= 0) {
			throw new IllegalArgumentException("Not a natural number");
		}
		double avg = 0;
		int sum = 0;
		for (int i = 1; i <= N; i++) {
			sum += i;
		}
		avg = (double)sum / N;
		return avg;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the natural number n: ");
		int x = sc.nextInt();
		CalcAverage c = new CalcAverage();
		try {
			System.out.println("Average number from 1 to N: " + c.avgFirstN(x));
		}
		catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}


