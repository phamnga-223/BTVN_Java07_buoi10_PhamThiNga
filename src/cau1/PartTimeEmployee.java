package cau1;

public class PartTimeEmployee extends Employee {

	private double hoursWorked;
	private double hourlyRate;

	public void displayInfo() {
		System.out.println("PartTimeEmployee: " + getName() + "; Age: " + getAge() + "; Salary: " + getSalary()
				+ "; Hours worked: " + this.hoursWorked
				+ "; Hourly rate: " + this.hourlyRate);
	}
	
	public void calculateSalary() {
		long result = this.getSalary() + (long) (this.hoursWorked * this.hourlyRate);
		System.out.println("Calculate Salary: " + result);
	}
	
	@Override
	public void inputData() {
		super.inputData();
		try {
			do {
				System.out.print("Hours Worked: ");
				this.hoursWorked = this.getScanner().nextDouble();
			} while (this.hoursWorked <= 0);
			
			do {
				System.out.print("Hours Rate: ");
				this.hourlyRate = this.getScanner().nextDouble();
			} while (this.hourlyRate <= 0);
		} catch (Exception ex) {
			System.out.println("Đã có lỗi xảy ra!");
			ex.printStackTrace();
		}
	}
}
