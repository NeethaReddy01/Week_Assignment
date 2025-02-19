package day2Tasks;

class Student {
	int rollno;
	String fname;
	
	public Student(int rollno,String fname) {
		this.rollno=rollno;
		this.fname=fname;
	}
	
	public void modify(int num) {
		num=num+1;
	}
	public void modify(Student student) {
		student.rollno=student.rollno+1;
	}
	public void modify(String name) {
		this.fname="Modify " + name;
	}
}

