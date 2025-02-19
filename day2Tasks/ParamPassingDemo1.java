package day2Tasks;

public class ParamPassingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student(0,"Jharkhand");
		int num=5;
		String name=student.fname;
		
		System.out.println("Before modify");
		System.out.println("Student fname : " +student.fname);
		System.out.println("primitive int num : "+ num);
		System.out.println("String name : " + name);
		
		student.modify(num);
		student.modify(student);
		student.modify(name);
		
		System.out.println("After mofification");
		System.out.println("Student fname : " + student.fname);
		System.out.println("primitative int num : " + num);
		System.out.println("String name : " + name);
	}

}
