package cau1;

public class PartTimeEmployee extends FullTimeEmployee {

	private double hoursWorked;
	private double hourlyRate;
	
	public PartTimeEmployee(String name, int age, String benefits, double hoursWorked, double hourlyRate) {
		super(name, age, benefits);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	public void display_info() {
		System.out.println("PartTimeEmployee: " + getName() + "; Age: " + getAge() + "; Salary: " + getSalary()
				+ "; Benefits: " + getBenefits() + "; Hours worked: " + this.hoursWorked
				+ "; Hourly rate: " + this.hourlyRate);
	}
	
	public long calculate_salary() {
		return 10000000;
	}
}
