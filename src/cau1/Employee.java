package cau1;

import java.util.Scanner;

/**
 * Câu 1: Hệ thống quản lý nhân viên với các loại nhân viên khác nhau
 *  	như Nhân viên toàn thời gian, Nhân viên bán thời gian
 *  	1. Lớp Employee:
 *  		+ Thuộc tính: name, age, salary
 *  		+ Phương thức: display_info(), calculate_salary()
 *  	2. Lớp kế thừa FullTimeEmployee:
 *  		+ Thuộc tính bổ sung: benefits
 *  		+ Phương thức: display_info(), calculate_salary()
 *  	3. Lớp kế thừa PartTimeEmployee:
 *  		+ Thuộc tính bổ sung: hours_worked, hourly_rate
 *  		+ Phương thức: display_info(), calculate_salary()
 */	
public class Employee {
	
	private Scanner scanner;
	
	private String name;
	private int age;
	private long salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public long getSalary() {
		return salary;
	}
	
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public void displayInfo() {
		System.out.println("Employee: " + this.name + "; Age: " + this.age + "; Salary: " + this.salary);
	}
	
	public void calculateSalary() {
		System.out.println("Salary: " + this.salary);
	}
	
	public void inputData() {
		try {
			this.scanner = new Scanner(System.in);
			System.out.println("Xin vui lòng nhập các thông tin sau: ");
			do {
				System.out.print("Name: ");
				this.name = scanner.nextLine();
			} while (this.name.strip().equals(""));
			
			do {
				System.out.print("Age: ");
				this.age = scanner.nextInt();
			} while (this.age <= 0);
			
			do {
				System.out.print("Salary: ");
				this.salary = scanner.nextLong();
			} while (this.salary <= 0);
		} catch (Exception ex) {
			System.out.println("Đã có lỗi xảy ra!");
			ex.printStackTrace();
		}
	}
}
