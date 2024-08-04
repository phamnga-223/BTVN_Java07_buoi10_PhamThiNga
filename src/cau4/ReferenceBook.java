package cau4;

public class ReferenceBook extends Book {

	private String field;
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Field: " + this.field);
	}
	
	@Override
	public void inputData() {
		super.inputData();
		
		try {
			do {
				System.out.println("Field: ");
				this.field = getScanner().nextLine();
			} while (this.field.strip().equals(""));
		} catch (Exception ex) {
			System.out.println("Error!");
			ex.printStackTrace();
		}
	}
}
