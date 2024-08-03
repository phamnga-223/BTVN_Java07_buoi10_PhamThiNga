package cau3;

public class Cau3Application {

	public static void main(String[] args) {
		Student student = new Student();
		student.inputData();
		student.displayInfo();
		
		System.out.println("---------------------------------");
		
		Teacher teacher = new Teacher();
		teacher.inputData();
		teacher.displayInfo();
		
		System.out.println("---------------------------------");
		
		Course course = new Course();
		course.inputData();		
		course.displayInfo();
	}
}
