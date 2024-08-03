package cau1_2;

public class Cau1_2Application {

	public static void main(String[] args) {		
		Student student1 = new Student("John Doe", 20, "123 Main St", "S001");
	    Teacher teacher1 = new Teacher("Jane Smith", 35, "456 Elm St", "T001");
		Course course1 = new Course("Math 101", "M101");

		student1.enroll(course1.getCourseName());
		course1.assignTeacher(teacher1.getName());
		System.out.println("----------------------------------------------");
		student1.displayInfo();
		System.out.println("----------------------------------------------");
		teacher1.displayInfo();
		System.out.println("----------------------------------------------");
		course1.displayInfo();
	}
}
