package q1;

import java.util.Scanner;

public class Student {
private int roll;
private String name;
private int marks;
private char grade;
Student() {
	
}

public int getRoll() {
	return roll;
}

public void setRoll(int roll) {
	this.roll = roll;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}

public char getGrade() {
	return grade;
}

public void setGrade(char grade) {
	this.grade = grade;
}

public void displayDetails() {
	Scanner s1= new Scanner(System.in);
	System.out.println("Enter Student roll no: ");
	int roll=s1.nextInt();
	System.out.println("Enter Student name: ");
	String name=s1.next();
	System.out.println("Enter Student marks: ");
	int marks=s1.nextInt();
	this.setRoll(roll);
	this.setName(name);
	this.setMarks(marks);
	this.setGrade(this.calculateGrade());
	
	/*System.out.println("Student details: ");
	System.out.println("Roll no: "+this.getRoll());
	System.out.println("Name: "+this.getName());
	System.out.println("Marks: "+this.getMarks());
	
	System.out.println("Grade: "+this.getGrade());
	System.out.println("===============================");*/
}
private char calculateGrade() {
	int marks=this.getMarks();
	if(marks>=500) {
		return 'A';
	}else if(marks>=400 && marks<500) {
		return 'B';
	}else {
		return 'C';
	}
}

@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
}

}
