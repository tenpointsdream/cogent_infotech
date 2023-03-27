package week2;

import java.util.Scanner;

class NegativeAmount extends Exception{
	NegativeAmount(String message){
		super(message);
	}
}

class InsufficientFunds extends Exception{
	InsufficientFunds(String message){
		super(message);
	}
}

class LowBalanceException extends Exception{
	LowBalanceException(String message){
		super(message);
	}
}

public class BankAccount {
	int accNo;
	String cusName;
	String accType;
	float balance;
	
	public BankAccount(int accNo, String cusName, String accType, float balance) throws LowBalanceException, NegativeAmount{
		this.accNo = accNo;
		this.cusName = cusName;
		if (balance < 0)
			throw new NegativeAmount("Cannot create account with nagative balance!!");
		else if (accType.equals("savings") && balance < 1000)
			throw new LowBalanceException("Need minimum balance of 1000 to create the savings account");
		else if (accType.equals("current") && balance < 5000)
			throw new LowBalanceException("Need minimum balance of 5000 to create the current account");
		this.accType = accType;
		this.balance = balance;
	}
	public void deposit(float amt) throws NegativeAmount{
		if (amt < 0)
			throw new NegativeAmount("Cannot deposit negative amount into account");
		balance += amt;
	}
	
	public void withdraw(float amt) throws NegativeAmount, InsufficientFunds{
		if (amt < 0)
			throw new NegativeAmount("Cannot deposit negative amount into account");
		
		if (accType.equals("savings") && (balance-amt) < 1000)
			throw new InsufficientFunds("Cannot withdraw below minimum balance of $1000");
		else if (accType.equals("current") && (balance-amt) < 5000) 
			throw new InsufficientFunds("Cannot withdraw below minimum balance of $5000");
		balance -= amt;
	}
	
	public float getBalance() throws LowBalanceException{
		if (accType == "savings" && balance < 1000)
			throw new LowBalanceException("Low balance in the savings account");
		else if (accType == "current" && balance < 5000) 
			throw new LowBalanceException("Low balance in the current account");
		return balance;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number: ");
		int accNo = sc.nextInt();
		System.out.println("Enter your name: ");
		String cusName = sc.next();
		System.out.println("Enter account type: ");
		String accType = sc.next();
		System.out.println("Enter initial balance: ");
		float initB = sc.nextFloat();
		try {
			int choice = 0;
			BankAccount ba = new BankAccount(accNo, cusName, accType, initB);
			do {
				System.out.println("\n-----MENU-----");
				System.out.println("1-Deposit");
				System.out.println("2-Withdraw");
				System.out.println("3-Display balance");
				System.out.println("4-Exit");
				System.out.println("Which option would you like?");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					try {
						System.out.print("Amount to deposit: ");
						ba.deposit(sc.nextFloat());
					}
					catch (NegativeAmount e) {
						System.out.println(e.getMessage());
					}
					break;
				case 2:
					try {
						System.out.print("Amount to withdraw: ");
						ba.withdraw(sc.nextFloat());
					}
					catch (NegativeAmount e) {
						System.out.println(e.getMessage());
					}
					catch (InsufficientFunds e) {
						System.out.println(e.getMessage());
					}
					break;
				case 3:
					try {
						System.out.print("Account [" +ba.accType+"] with balance: " + ba.getBalance());
					}
					catch (LowBalanceException e) {
						System.out.println(e.getMessage());
					}
					break;
				case 4: 
					break;
				}
			}
			while (choice != 4);
		}
		catch (LowBalanceException e) {
			System.out.println(e.getMessage());
		}
		catch (NegativeAmount e) {
			System.out.println(e.getMessage());
		}
	}
}
