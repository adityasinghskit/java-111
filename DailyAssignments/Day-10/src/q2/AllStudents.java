package q2;

import java.util.Scanner;

public class AllStudents {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	HistoryStudent s1= new HistoryStudent();
	System.out.println("Enter details of Student1");
	System.out.println("Name: ");
	s1.name=scan.next();
	System.out.println("Address: ");
	s1.address=scan.next();
	System.out.println("History marks: ");
	s1.historyMarks=scan.nextInt();
	System.out.println("Civics marks: ");
	s1.civicsMarks=scan.nextInt();
	System.out.println("Student1 overall percentage:"+s1.getPercentage());
	
	ScienceStudent s2= new ScienceStudent();
	System.out.println("Enter details of Student2");
	System.out.println("Name: ");
	s2.name=scan.next();
	System.out.println("Address: ");
	s2.address=scan.next();
	System.out.println("Physics marks: ");
	s2.physicsMarks=scan.nextInt();
	System.out.println("Chemistry marks: ");
	s2.chemistryMarks=scan.nextInt();
	System.out.println("Math marks: ");
	s2.mathsMarks=scan.nextInt();
	System.out.println("Student2 overall percentage:"+s2.getPercentage());
	scan.close();
}
}
