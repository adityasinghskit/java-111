package pack1;

public class Student {
	int roll;
	String name;
	int marks;
	void displayStudentDetails(int roll, String name, int marks) {
		System.out.println("Roll is: "+roll);
		System.out.println("Name is: "+name);
		System.out.println("Marks is: "+marks);
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.roll=12;
		s1.name="Aditya";
		s1.marks=90;
		s1.displayStudentDetails(s1.roll, s1.name, s1.marks);
		System.out.println("================");
		Student s2=new Student();
		s2.roll=22;
		s2.name="Diksha";
		s2.marks=60;
		s2.displayStudentDetails(s2.roll, s2.name, s2.marks);
		
		s1=s2=null;
	}
}
