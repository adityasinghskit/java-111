package q2;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Number of Student objects: ");
	int n=scan.nextInt();
	int avg=0;
	Student[] s1=new Student[n];
	for(int i=0;i<n;i++) {
		Scanner scan1=new Scanner(System.in);
		System.out.println("Enter student "+(i+1)+" details: ");
		System.out.println("Enter roll no: ");
		int roll=scan1.nextInt();
		System.out.println("Enter name: ");
		String name=scan1.next();
		System.out.println("Enter address: ");
		String address=scan1.next();
		System.out.println("Enter marks: ");
		int marks=scan1.nextInt();
		Student std= new Student();
		s1[i]=std;
		s1[i].setRoll(roll);
		s1[i].setName(name);
		s1[i].setAddress(address);
		s1[i].setMarks(marks);
		avg+=marks;
	}
	scan.close();
	for(int i=0;i<n;i++) {
		System.out.println("Student "+(i+1)+" details: ");
		System.out.println("Roll no: "+s1[i].getRoll());
		System.out.println("Name: "+s1[i].getName());
		System.out.println("Address: "+s1[i].getAddress());
		System.out.println("Marks: "+s1[i].getMarks());
		System.out.println("===========================");
	}
	System.out.println("Average marks: "+(avg/n));
}
}
