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

	public void searchByPRN(int prn) {
        	for (Student student : students) {
            		if (student.getPRN() == prn) {
                		System.out.println("Student Found:");
                		student.display();
                		return;
            		}
        	}
        	System.out.println("Student with PRN " + prn + " not found.");
    	}

	public void searchByName(String name) {
        	for (Student student : students) {
            		if (student.getName().equalsIgnoreCase(name)) {
                		System.out.println("Student Found:");
                		student.display();
                		return;
            		}
        	}
        	System.out.println("Student with name " + name + " not found.");
    	}

	public void searchByPosition(int position) {
        if (position < 0 || position >= students.size()) {
            System.out.println("Invalid position.");
            return;
        }
        System.out.println("Student at Position " + position + ":");
        students.get(position).display();
    }
}
