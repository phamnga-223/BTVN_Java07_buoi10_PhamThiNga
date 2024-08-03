package cau3;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

	private String employeeId;
	private List<String> subjects;
	
	@Override
	public void displayInfo() {
		System.out.println("Employee id: " + this.employeeId);
		
		super.displayInfo();
		
		if (this.subjects != null && this.subjects.size() > 0) {
			System.out.println("Subjects: ");
			for (String subject : this.subjects) {
				System.out.println(subject);
			}
		}
	}
	
	public void assign (String subject) {
		if (subject == null || subject.equals("")) {
			System.out.println("Subject is invalid!");
			return;
		}
		
		if (this.subjects == null) {
			this.subjects = new ArrayList<String>();
		}
		this.subjects.add(subject);
		System.out.println("Assign subject successfully!");
	}
	
	@Override
	public void inputData() {
		super.inputData();
		
		try {			
			do {
				System.out.print("Please enter Employee Id: ");
				this.employeeId = this.getScanner().nextLine();
			} while (this.employeeId.strip().equals(""));
			
			System.out.print("Please enter Subject: ");
			while (this.getScanner().hasNextLine()) {
				String subject = this.getScanner().nextLine();
				if (!subject.strip().equals("")) {
					assign(subject);
					System.out.print("Please enter new Subject: ");
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
