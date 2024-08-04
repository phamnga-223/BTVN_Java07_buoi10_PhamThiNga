package cau1;

public class FullTimeEmployee extends Employee {

	private long benefits;
	
	public long getBenefits() {
		return benefits;
	}

	public void setBenefits(long benefits) {
		this.benefits = benefits;
	}

	public void displayInfo() {
		System.out.println("FullTimeEmployee: " + getName() + "; Age: " + getAge()
				+ "; Salary: " + getSalary() + "; Benefits: " + this.benefits);
	}
	
	public void calculateSalary() {
		long result = this.getSalary() + this.benefits;
		System.out.println("Calculate Salary: " + result);
	}
	
	@Override
	public void inputData() {
		super.inputData();
		try {
			do {
				System.out.print("Benefits: ");
				this.benefits = this.getScanner().nextLong();
			} while (this.benefits <= 0);
		} catch (Exception ex) {
			System.out.println("Đã có lỗi xảy ra!");
			ex.printStackTrace();
		}
	}
}
