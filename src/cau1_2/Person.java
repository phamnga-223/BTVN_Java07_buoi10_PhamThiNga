package cau1_2;

import java.util.Scanner;

public class Person {

	private Scanner scanner;
	
	private String name;
	private int age;
	private String address;
	
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayInfo() {
		System.out.println("Name: " + this.name + "; Age: " + this.age
				+ "; Address: " + this.address);
	}
	
	public void inputData() {
		try {
			this.scanner = new Scanner(System.in);
			
			do {
				System.out.print("Please enter Name: ");
				this.name = this.scanner.nextLine();
			} while (this.name.strip().equals(""));
			
			do {
				System.out.print("Age: ");
				this.age = this.scanner.nextInt();
			} while (this.age <= 0);
			
			this.scanner.nextLine();

			do {
				System.out.print("Address: ");
				this.address = this.scanner.nextLine();
			} while (this.address.strip().equals(""));			
		} catch (Exception ex) {
			System.out.println("Error!");
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
