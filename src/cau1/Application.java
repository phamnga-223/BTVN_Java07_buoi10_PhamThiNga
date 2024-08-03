package cau1;

import java.util.ArrayList;
import java.util.List;

import cau2.ReferenceBook;
import cau2.TextBook;

public class Application {

	public static void main(String[] args) {		
//		List<Employee> listEmployee = new ArrayList<Employee>();
//		Employee employee = new Employee("Nguyen Van Linh", 29);
//		listEmployee.add(employee);
//		FullTimeEmployee ftEmploy = new FullTimeEmployee("Tran Van Tu", 20, "Tuần off 2 buổi, Tiền xe 500K");
//		listEmployee.add(ftEmploy);
//		PartTimeEmployee ptEmploy = new PartTimeEmployee("Pham Thi Nga", 23, "Tuần of2 2 buổi", 4, 3);
//		listEmployee.add(ptEmploy);
//		
//		for (Employee e:listEmployee) {
//			e.display_info();
//		}
		
		//Cau 2:
		TextBook textBook = new TextBook();
		textBook.inputData();
		textBook.displayInfo();
		
		ReferenceBook referBook = new ReferenceBook();
		referBook.inputData();
		referBook.displayInfo();
	}
	
}
