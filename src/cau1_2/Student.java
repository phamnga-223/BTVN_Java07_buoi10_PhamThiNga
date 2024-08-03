package cau1_2;

public class Student extends Person {

	private String studentId;
	private String[] courses;
	
	public Student(String name, int age, String address, String studentId) {
		super(name, age, address);
		
		this.studentId = studentId;
		this.courses = new String[0];
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Student id: " + this.studentId);

		super.displayInfo();	
		
		if (this.courses != null && this.courses.length > 0) {
			System.out.println("Enrolled Courses: ");
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
		
		if (this.courses == null || this.courses.length == 0) {
			this.courses = new String[1];
			this.courses[0] = course;
		} else {
			int length = this.courses.length + 1;
			String[] courses = new String [length];
			courses = this.courses;
			courses[length -1] = course;
			
			this.courses = courses;
		}
				
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
