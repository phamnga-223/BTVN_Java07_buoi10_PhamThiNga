package cau3;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

	private String studentId;
	private List<String> courses;
	
	@Override
	public void displayInfo() {
		System.out.println("Student id: " + this.studentId);

		super.displayInfo();	
		
		if (this.courses != null && this.courses.size() > 0) {
			System.out.println("Courses: ");
			for (String course : this.courses) {
				System.out.println(course);
			}
		}
	}
	
	public void enroll(String course) {
		if (course == null || course.strip().equals("")) {
			System.out.println("Course is invalid!");
			return;
		}
		
		if (this.courses == null) {
			this.courses = new ArrayList<String>();
		}
				
		this.courses.add(course);
		System.out.println("Enroll successfully!");
	}
	
	@Override
	public void inputData() {
		super.inputData();
		
		try {			
			do {
				System.out.print("Please enter Student Id: ");
				this.studentId = this.getScanner().nextLine();
			} while (this.studentId.strip().equals(""));
			
			System.out.print("Please enter Course: ");
			while (this.getScanner().hasNextLine()) {
				String course = this.getScanner().nextLine();
				if (!course.strip().equals("")) {
					enroll(course);
					System.out.print("Please enter new Course: ");
				} else {
					break;
				}
			}			
		} catch (Exception ex) {
			System.out.println("Error!");
			ex.printStackTrace();
		}
	}
}
