package cau1_2;

public class Teacher extends Person {

	private String employeeId;
	private String[] subjects;
	
	public Teacher(String name, int age, String address, String employeeId) {
		super(name, age, address);
		
		this.employeeId = employeeId;
		this.subjects = new String[0];
	}

	@Override
	public void displayInfo() {
		System.out.println("Employee id: " + this.employeeId);
		
		super.displayInfo();
		
		if (this.subjects != null && this.subjects.length > 0) {
			System.out.println("Assigned Subjects: ");
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
		
		if (this.subjects == null || this.subjects.length == 0) {
			this.subjects = new String[1];
			this.subjects[0] = subject;
		} else {
			int length = this.subjects.length + 1;
			String[] subjects = new String[length + 1];
			subjects = this.subjects;
			subjects[length - 1] = subject;
			this.subjects = subjects;
		}
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
