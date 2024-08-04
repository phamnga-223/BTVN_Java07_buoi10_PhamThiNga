package cau4;

public class Cau4Application {

	public static void main(String[] args) {
		System.out.println("------------------Book----------------");
		Book book = new Book();
		book.inputData();
		book.displayInfo();
		
		System.out.println("------------------TextBook----------------");
		TextBook textBook = new TextBook();
		textBook.inputData();
		textBook.displayInfo();
		
		System.out.println("------------------ReferenceBook----------------");
		ReferenceBook referenceBook = new ReferenceBook();
		referenceBook.inputData();
		referenceBook.displayInfo();
		
		System.out.println("------------------User----------------");
		User user = new User();
		user.inputData();
		
		//Borrow book
		String bookName = user.inputBook();
		user.borrow(bookName);
		user.displayInfo();
		
		//Return book
		bookName = user.inputBook();
		user.returnBook(bookName);
		user.displayInfo();
	}
}
