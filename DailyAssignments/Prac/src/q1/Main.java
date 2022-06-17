package q1;

public class Main {
	public static void fun1(Intr i) {
		i.printDetails(new Student());
	} 
public static void main(String[] args) {
	Intr i1= s -> {
		System.out.println("roll:"+s.getRollNo());
		System.out.println("name:"+s.getName());
		System.out.println("marks:"+s.getMarks());
	};
	
	i1.printDetails(new Student(10,"Ram",850));
}
}
