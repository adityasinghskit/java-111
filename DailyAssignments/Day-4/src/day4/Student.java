package day4;

class Std{
	public static void main(String[] args) {
		Student s0=new Student();
		System.out.println(s0.getNo());
		
	}
}
public class Student {
	private int no=10;
	private int roll;
	private String name;
	private int age;
	private int marks;
	
	Student(){
		
	}
	
	Student(int roll, String name, int age, int marks){
		this.roll=roll;
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	//getter & setter methods
	public int getNo() {
		return this.no; 
	}
	
	public void setRoll(int r) {
		this.roll=r;
	}
	public int getRoll() {
		return this.roll;
	}
	public void setName(String n) {
		this.name=n;
	}
	public String getName() {
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public void setAge(int a) {
		this.age=a;
	}
	public int getMarks(){
		return this.marks;
	}
	public void setMarks(int m) {
		this.marks=m;
	}
	public void showDetails() {
		System.out.println("Student name:"+this.name);
		System.out.println("Student rollno:"+this.roll);
		System.out.println("Student age:"+this.age);
		System.out.println("Student marks:"+this.marks);
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setName("Aditya");
		s1.setRoll(23);
		s1.setAge(25);
		s1.setMarks(90);
		s1.showDetails();
		
		Student s2= new Student(12,"Ramesh",24,70);
		s2.showDetails();
	}
}
