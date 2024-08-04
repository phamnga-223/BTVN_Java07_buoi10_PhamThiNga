package cau2_2;

import java.util.Scanner;

public class BankAccount {

	private Scanner scanner;
	
	private String accountNumber;
	private String accountHolder;
	private long balance;
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public void deposit(long amount) {
		if (amount <= 0) {
			System.out.println("Amount is invalid!");
			return;
		}
		
		this.balance += amount;
		System.out.println("Deposit successully!");
	}
	
	public void withdraw(long amount) {
		if (amount <= 0) {
			System.out.println("Amount is invalid!");
			return;
		} else if (amount > this.balance) {
			System.out.println("Amount mustn't large than Balace!");
			return;
		}
		
		this.balance -= amount;
		System.out.println("Withdraw successully!");
	}
	
	public void displayInfo() {
		System.out.println("Account Number: " + this.accountNumber + "; Account Holder: " + this.accountHolder
				+ "; Balance: " + this.balance);
	}
	
	public void inputData() {
		try {
			this.scanner = new Scanner(System.in);
		
			do {
				System.out.print("Please enter Account Number: ");
				this.accountNumber = this.scanner.nextLine();
			} while (this.accountNumber.strip().equals(""));
			
			do {
				System.out.print("Account Holder: ");
				this.accountHolder = this.scanner.nextLine();
			} while (this.accountHolder.strip().equals(""));
			
			do {
				System.out.print("Balance: ");
				this.balance = this.scanner.nextLong();
			} while (this.balance <= 0);
		} catch (Exception ex) {
			System.out.println("Error!");
			ex.printStackTrace();
		}
	}
	
	public long inputAmount() {
		long amount = 0;
		
		try {
			do {
				System.out.print("Please enter amount: ");
				amount = this.scanner.nextLong();
			} while (amount <= 0);
		} catch (Exception ex) {
			System.out.println("Error!");
			ex.printStackTrace();
		}
		
		return amount;
	}
}
