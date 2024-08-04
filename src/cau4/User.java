package cau4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {

	private Scanner scanner;
	
	private String userId;
	private String name;
	private List<String> borrowedBooks;	
	
	public User() {
		this.borrowedBooks = new ArrayList<String>();
	}

	public void inputData() {
		try {
			this.scanner = new Scanner(System.in);
			
			do {
				System.out.print("Please enter User Id: ");
				this.userId = scanner.nextLine();
			} while (this.userId.strip().equals(""));
			
			do {
				System.out.print("Name: ");
				this.name = scanner.nextLine();
			} while (this.name.strip().equals(""));
		} catch (Exception ex) {
			System.out.println("Error!");
			ex.printStackTrace();
		}
	}
	
	public void borrow(String book) {
		if (book == null || book.equals("")) {
			System.out.println("Book is invalid!");
			return;
		}
		
		this.borrowedBooks.add(book);
		System.out.println("Borrow book successfully!");
	}
	
	public void returnBook(String book) {
		if (book == null || book.equals("")) {
			System.out.println("Book is invalid!");
			return;
		}
		
		if (this.borrowedBooks == null || this.borrowedBooks.size() == 0) {
			System.out.println("List borrowed book is empty");
			return;
		}
		
		if (!this.borrowedBooks.contains(book)) {
			System.out.println("List borrowed book is not contains this book!");
			return;
		}
		
		this.borrowedBooks.remove(book);
		System.out.println("Return book successfully!");
	}

	public void displayInfo() {
		System.out.println("UserId: " + userId + "; Name: " + name);
		if (this.borrowedBooks != null && this.borrowedBooks.size() > 0) {
			System.out.println("Borrowed books: ");
			for (String book : borrowedBooks) {
				System.out.println(book);
			}
		}
	}

	public String inputBook() {
		String book = "";
		
		try {			
			do {
				System.out.print("Please enter Book: ");
				book = this.scanner.nextLine();
			} while (book.strip().equals(""));
		} catch (Exception ex) {
			System.out.println("Error!");
			ex.printStackTrace();
		}
		
		return book;
	}
}
