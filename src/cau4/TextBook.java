package cau4;

public class TextBook extends Book {

	private String subject;
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Subject: " + this.subject);
	}
	
	@Override
	public void inputData() {
		super.inputData();
		
		try {
			do {
				System.out.println("Subject: ");
				this.subject = getScanner().nextLine();
			} while (this.subject.strip().equals(""));
		} catch (Exception ex) {
			System.out.println("Error!");
			ex.printStackTrace();
		}
	}
}
