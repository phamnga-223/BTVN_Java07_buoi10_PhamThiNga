package cau3;

import java.util.Scanner;

public class Course {

	private String courseName;
	private String courseCode;
	private String teacher;
	
	public void displayInfo() {
		System.out.println("Course Name: " + this.courseName + "; Course Code: " + this.courseCode
				+ "; Teacher: " + this.teacher);
	}
	
	public void assignTeacher(String teacher) {
		if (teacher == null || teacher.equals("")) {
			System.out.println("Teacher is invalid!");
			return;
		}
		
		this.teacher = teacher;
	}
	
	public void inputData() {
		try {
			Scanner scanner = new Scanner(System.in);
			
			do {
				System.out.print("Please enter Course Name: ");
				this.courseName = scanner.nextLine();
			} while (this.courseName.strip().equals(""));
			
			do {
				System.out.print("Course Code: ");
				this.courseCode = scanner.nextLine();
			} while (this.courseCode.strip().equals(""));
			
			System.out.print("Please enter Teacher: ");
			assignTeacher(scanner.nextLine());
			
			scanner.close();
		} catch (Exception ex) {
			System.out.println("Error!");
			ex.printStackTrace();
		}
	}

}
