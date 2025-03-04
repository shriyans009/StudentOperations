//Main.java

import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		StudentOperations operations = new StudentOperations();
		int choice = 1;

		while(choice == 1){

			System.out.println("Enter Name: ");
			String name = scan.nextLine();
			System.out.println("Enter PRN: ");
			int prn = Integer.parseInt(scan.nextLine());
			System.out.println("Enter Dept: ");
			String dept = scan.nextLine();
			System.out.println("Enter Batch: ");
			String batch = scan.nextLine();
			System.out.println("Enter CGPA: ");
			float cgpa = Float.parseFloat(scan.nextLine());

			Student student = new Student(name, prn, dept, batch, cgpa);
			operations.addStudent(student);

			System.out.println("Do you want to add more students? (1/0): ");
			choice = Integer.parseInt(scan.nextLine());
		}

		System.out.println("Displaying all Students:");
		operations.displayStudents();
		scan.close();
		
	}

}