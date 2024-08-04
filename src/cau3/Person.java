package cau3;

import java.util.Scanner;

/**
 * Câu 3: Quản lý hệ thống trường học với các lớp học sinh, giáo viên, quản lý các khóa học mà họ
 * tham gia/giảng dạy.
 * 		1. Lớp cơ sở Person:
 * 			+ name, age, address
 * 			+ displayInfo()
 * 		2. Lớp kế thừa Student
 * 			+ tt bổ sung: studentId, courses
 * 			+ displayInfo(), enroll(course)
 * 		3. Lớp kế thừa Teacher
 * 			+ tt bổ sung: employeeId, subjects
 * 			+ displayInfo(), assigin(subject)
 * 		4. Course:
 * 			+ courseName, courseCode, teacher
 * 			+ assignTeacher(teacher), displayInfo()
 */
public class Person {

	private Scanner scanner;
	
	private String name;
	private int age;
	private String address;
	
	public void displayInfo() {
		System.out.println("Name: " + this.name + "; Age: " + this.age
				+ "; Address: " + this.address);
	}
	
	public void inputData() {
		try {
			this.scanner = new Scanner(System.in);
			
			do {
				System.out.print("Please enter Name: ");
				this.name = this.scanner.nextLine();
			} while (this.name.strip().equals(""));
			
			do {
				System.out.print("Age: ");
				this.age = this.scanner.nextInt();
			} while (this.age <= 0);
			
			this.scanner.nextLine();

			do {
				System.out.print("Address: ");
				this.address = this.scanner.nextLine();
			} while (this.address.strip().equals(""));			
		} catch (Exception ex) {
			System.out.println("Error!");
			ex.printStackTrace();
		}
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}
}
