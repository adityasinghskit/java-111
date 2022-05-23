package q4;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan= new Scanner(System.in);
	System.out.println("Number of student to add: ");
	int n=scan.nextInt();
	for(int i=1;i<=n;i++) {
		Student s1=new Student();
		System.out.println("Roll Number:");
		s1.setR(scan.nextInt());
		System.out.println("Name:");
		s1.setN(scan.next());
		System.out.println("Marks:");
		s1.setM(scan.nextInt());
		System.out.println("Student"+i+"details");
		System.out.println("Student roll no: "+s1.getR());
		System.out.println("Student name: "+s1.getN());
		System.out.println("Student marks: "+s1.getM());
	}
	scan.close();
}
}
