package q1;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	Student s1= new Student();
	s1.displayDetails();
	Student s2= new Student();
	s2.displayDetails();
	System.out.println(s1);
	System.out.println(s2);
	scan.close();
}
}
