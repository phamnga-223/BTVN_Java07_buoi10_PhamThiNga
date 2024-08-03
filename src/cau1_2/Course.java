package cau1_2;

import java.util.Scanner;

public class Course {

	private String courseName;
	private String courseCode;
	private String teacher;	
	
	public Course(String courseName, String courseCode) {
		this.courseName = courseName;
		this.courseCode = courseCode;
	}
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void displayInfo() {
		System.out.println("Course Name: " + this.courseName + "; Course Code: " + this.courseCode);
		if (this.teacher != null && !this.teacher.equals("")) {
			System.out.println("Teacher: " + this.teacher);
		}
	}
	
	public void assignTeacher(String teacher) {
		if (teacher == null || teacher.equals("")) {
			System.out.println("Teacher is invalid!");
			return;
		}
		
		this.teacher = teacher;
		System.out.println("Assign successfully!");
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
