package week2;

import java.util.Scanner;

class DivideByZeroException extends Exception{
	DivideByZeroException(String message) {
		super(message);
	}
}
public class Number {
	int firstNumber;
	int secondNumber;
	double result;
	
	Number(int x, int y) {
		firstNumber = x;
		secondNumber = y;
	}
	
	public void add() {
		result = firstNumber + secondNumber;
	}
	
	public void sub() {
		result = firstNumber - secondNumber;
	}
	
	public void mul() {
		result = firstNumber * secondNumber;
	}
	
	public void div() throws DivideByZeroException{
		if (secondNumber == 0)
			throw new DivideByZeroException("Cannot divide by zero!");
		result = (double)firstNumber / (double)secondNumber;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number a: ");
		int a = sc.nextInt();
		System.out.println("Enter number b: ");
		int b = sc.nextInt();
		
		Number n = new Number(a, b);
		int choice = 0;
		do {
			System.out.println("-----MENU-----");
			System.out.println("1-Addition");
			System.out.println("2-Subtraction");
			System.out.println("3-Multiplication");
			System.out.println("4-Division");
			System.out.println("5-Exit");
			System.out.println("Which option would you like?");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				n.add();
				System.out.println("\nResult: " + n.result);
				break;
			case 2: 
				n.sub();
				System.out.println("\nResult: " + n.result);
				break;
			case 3:
				n.mul();
				System.out.println("\nResult: " + n.result);
				break;
			case 4: 
				try {
					n.div();
					System.out.println("\nResult: " + n.result);
				}
				catch (DivideByZeroException e){
					System.err.println(e.getMessage());
				}
				break;
			case 5: 
				break;
			}
		}
		while (choice != 5);
		sc.close();
	}
}
