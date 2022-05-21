package day4;

class Std{
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setName("Aditya");
		s1.setRoll(23);
		s1.setAge(25);
		s1.setMarks(90);
		System.out.println("Student S1 name: "+s1.getName());
		System.out.println("Student S1 roll: "+s1.getRoll());
		System.out.println("Student S1 age: "+s1.getAge());
		System.out.println("Student S1 marks: "+s1.getMarks());
		
		Student s2= new Student(12,"Ramesh",24,70);
		System.out.println("Student S2 name: "+s2.getName());
		System.out.println("Student S2 roll: "+s2.getRoll());
		System.out.println("Student S2 age: "+s2.getAge());
		System.out.println("Student S2 marks: "+s2.getMarks());
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
		if(a>18 && a<60) {
		this.age=a;
		}else {
			System.out.println("Invalid age");
		}
	}
	public int getMarks(){
		return this.marks;
	}
	public void setMarks(int m) {
		if(m>0 && m<500) {
		this.marks=m;
		}else {
			System.out.println("Invalid marks");
		}
	}
	public static void main(String[] args) {
		
	}
}
