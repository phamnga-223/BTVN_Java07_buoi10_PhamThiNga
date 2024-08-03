package cau2_2;

public class BankAccount {

	private String accountNumnber;
	private String accountHolder;
	private long balance;
	
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
		System.out.println("Deposit successully!");
	}
	
	public void displayInfo() {
		System.out.println("Account Number: " + this.accountNumnber + "; Account Holder: " + this.accountHolder
				+ "; Balance: " + this.balance);
	}
}
