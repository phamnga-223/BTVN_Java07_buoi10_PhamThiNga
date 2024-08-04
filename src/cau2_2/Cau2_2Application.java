package cau2_2;

public class Cau2_2Application {

	public static void main(String[] args) {
		//1.1. Init BankAccount
		BankAccount bankAccount = new BankAccount();
		bankAccount.inputData();
		bankAccount.displayInfo();
		
		//1.2. Bank Account Deposit
		System.out.println("------------------------BankAcount Deposit-----------------------");
		long amount = bankAccount.inputAmount();
		bankAccount.deposit(amount);
		bankAccount.displayInfo();

		//1.3. Bank Account WithDraw
		System.out.println("------------------------BankAcount WithDraw-----------------------");
		amount = bankAccount.inputAmount();
		bankAccount.withdraw(amount);
		bankAccount.displayInfo();
		
		//2.1. Init SavingsAccount
		SavingsAccount savingAccount = new SavingsAccount();
		savingAccount.inputData();		
		savingAccount.addInterest();
		savingAccount.displayInfo();
		
		//2.2. Saving Account Add Interest
		System.out.println("------------------------SavingsAccount Add Interest-----------------------");
		savingAccount.addInterest();
		savingAccount.displayInfo();
				
		//3.1. Init CheckingAccount
		CheckingAccount checkingAccount = new CheckingAccount();
		checkingAccount.inputData();
		checkingAccount.displayInfo();
		
		//3.2. OverDraft Limit WithDraw
		System.out.println("------------------------Checking WithDraw-----------------------");
		amount = checkingAccount.inputAmount();
		checkingAccount.withdraw(amount);
		checkingAccount.displayInfo();
	}

}
