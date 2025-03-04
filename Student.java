//Student.java

class Student{
	private String name;
	private int prn;
	private String dept;
	private String batch;
	private float cgpa;

	public Student(String name, int prn, String dept,String batch, float cgpa){
		this.name = name;
		this.prn = prn;
		this.dept = dept;
		this.batch = batch;
		this.cgpa = cgpa;
	}

	//Name
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	//PRN
	public int getPRN(){
		return prn;
	}

	public void setPRN(int prn){
		this.prn = prn;
	}

	//Dept
	public String getDept(){
		return dept;
	}

	public void setDept(String dept){
		this.dept = dept;
	}

	//Batch
	public String getBatch(){
		return batch;
	}

	public void setBatch(String batch){
		this.batch = batch;
	}

	//CGPA
	public float getCGPA(){
		return cgpa;
	}

	public void setCGPA(float cgpa){
		this.cgpa = cgpa;
	}

	//Display
	public void display(){
		System.out.println("Name: "+ name + " PRN: " + prn + " Dept: " + dept + " Batch: " + batch + " CGPA: " + cgpa);
	}

}