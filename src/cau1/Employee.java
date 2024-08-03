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
	
	private String name;
	private int age;
	private long salary;
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
		this.salary = calculate_salary();
	}

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
	
	public void display_info() {
		System.out.println("Employee: " + this.name + "; Age: " + this.age + "; Salary: " + this.salary);
	}
	
	public long calculate_salary() {
		return this.salary;
	}
	
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Xin vui lòng nhập các thông tin sau: ");
		System.out.println("Name: ");
		this.name = scanner.nextLine();
		System.out.println("Age: ");
	}
}
