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
	
	public void updateStudent(int prn) {
        Scanner scan = new Scanner(System.in);
        for (Student student : students) {
            if (student.getPRN() == prn) {
                System.out.println("Enter new Name (leave blank to keep current): ");
                String name = scan.nextLine();
                if (!name.isEmpty()) student.setName(name);

                System.out.println("Enter new Dept (leave blank to keep current): ");
                String dept = scan.nextLine();
                if (!dept.isEmpty()) student.setDept(dept);

                System.out.println("Enter new Batch (leave blank to keep current): ");
                String batch = scan.nextLine();
                if (!batch.isEmpty()) student.setBatch(batch);

                System.out.println("Enter new CGPA (or -1 to keep current): ");
                float cgpa = Float.parseFloat(scan.nextLine());
                if (cgpa != -1) student.setCGPA(cgpa);

                System.out.println("Student details updated successfully.");
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }
}
