package cau2_2;

public class SavingsAccount extends BankAccount {

	private double interestRate;
	
	public void addInterest() {
		if (this.interestRate < 0) {
			System.out.println("Interest Rate is invalid!");
			return;
		}
		
		long result = (long) (this.getBalance() * interestRate);
		this.setBalance(this.getBalance() + result);
		System.out.println("Add Interest successfully!");
	}
	
	@Override
	public void inputData() {
		super.inputData();
		try {
			do {
				System.out.print("Interest Rate: ");
				this.interestRate = this.getScanner().nextDouble();
			} while (this.interestRate < 0);
		} catch (Exception ex) {
			System.out.println("Error!");
			ex.printStackTrace();
		}
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Interest Rate: " + this.interestRate);
	}
}
