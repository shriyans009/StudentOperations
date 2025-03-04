//StudentOperations.java

import java.util.*;
class StudentOperations{
	ArrayList<Student> students;

	public StudentOperations(){
		this.students = new ArrayList<>();
	}

	public void addStudent(Student student){
		students.add(student);
		System.out.println("Student Added.");
	}

	public void displayStudents(){
		if (students.isEmpty()){
			System.out.println("No students available");
			return;
		}
		for (Student student : students){
			student.display();
		}
	}
}