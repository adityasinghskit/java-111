package q4;

import java.util.Scanner;

public class Main {
public static Person generatePerson(Person person) {
	Scanner s1= new Scanner(System.in);
	System.out.println("Enter details: ");
	
	if(person instanceof Instructor) {
		Instructor i1=(Instructor)person;
		System.out.println("Instructor ID");
		i1.instructorId=s1.nextInt();
		System.out.println("Salary: ");
		i1.salary=s1.nextInt();
		
		
		i1.address=new Address();
		System.out.println("City: ");
		i1.address.city=s1.next();
		System.out.println("State: ");
		i1.address.state=s1.next();
		System.out.println("PinCode: ");
		i1.address.pinCode=s1.next();
		return i1;
		
	}else {
		Student std1= (Student)person;
		System.out.println("Student ID");
		std1.studentId=s1.nextInt();
		System.out.println("Course enrolled: ");
		std1.courseEnrolled=s1.next();
		System.out.println("Course fee: ");
		std1.courseFee=s1.nextInt();
		
		std1.address=new Address();
		System.out.println("City: ");
		std1.address.city=s1.next();
		System.out.println("State: ");
		std1.address.state=s1.next();
		System.out.println("PinCode: ");
		std1.address.pinCode=s1.next();
		return std1;
	}
	
}
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	Person ni=generatePerson(new Instructor());
	Person ns=generatePerson(new Student());
	System.out.println(ns);
	System.out.println(ni);
	scan.close();
}
}
