package cau1;

public class FullTimeEmployee extends Employee {

	private String benefits;
	
	public FullTimeEmployee(String name, int age, String benefits) {
		super(name, age);
		this.benefits = benefits;
	}
	
	public String getBenefits() {
		return benefits;
	}

	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}

	public void display_info() {
		System.out.println("FullTimeEmployee: " + getName() + "; Age: " + getAge()
				+ "; Salary: " + getSalary() + "; Benefits: " + this.benefits);
	}
	
	public long calculate_salary() {
		return 30000000;
	}
}
