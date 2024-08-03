package cau2;

import java.util.Scanner;

/**
 * Câu 2: Tạo một hệ thống quản lý thư viện với các loại sách khác nhau như Sách giáo khoa và Sách tham khảo.
 */
public class Book {
	
	private String title;
	private String author;
	private String isbn;
	private Scanner scanner;
	
	public void displayInfo() {
		System.out.println("Title: " + this.title + "\n" + "Author: " + this.author
				+ "\n ISBM: " + this.isbn);
	}
	
	public void inputData() {
		try {
			this.scanner = new Scanner(System.in);
			System.out.println("Please enter some information: ");
			
			do {
				System.out.print("Title: ");
				this.title = this.scanner.nextLine();
			} while (this.title.strip().equals(""));
			
			do {
				System.out.print("Author: ");
				this.author = this.scanner.nextLine();
			} while (this.author.strip().equals(""));
			
			do {
				System.out.print("ISBN: ");
				this.isbn = this.scanner.nextLine();
			} while (this.isbn.strip().equals(""));
		} catch (Exception ex) {
			System.out.println("Dữ liệu nhập vào không hợp lệ!");
			ex.printStackTrace();
		}
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

}
