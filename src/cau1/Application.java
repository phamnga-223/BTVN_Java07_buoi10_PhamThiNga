package cau1;

public class Application {

	public static void main(String[] args) {
		System.out.println("--------------Employee----------------");
		Employee employee = new Employee();
		employee.inputData();
		employee.calculateSalary();
		employee.displayInfo();
		
		System.out.println("--------------Fulltime Employee----------------");
		FullTimeEmployee ftEmployee = new FullTimeEmployee();
		ftEmployee.inputData();
		ftEmployee.calculateSalary();
		ftEmployee.displayInfo();
		
		System.out.println("--------------Partime Employee----------------");
		PartTimeEmployee ptEmployee = new PartTimeEmployee();
		ptEmployee.inputData();
		ptEmployee.calculateSalary();
		ptEmployee.displayInfo();
	}
	
}
