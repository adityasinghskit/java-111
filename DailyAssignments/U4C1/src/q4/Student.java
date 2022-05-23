package q4;

public class Student {
private int rollNumber;
private String studentName;
private int marks;
Student(){
	
}
Student(int roll, String name, int marks){
	this.rollNumber=roll;
	this.studentName=name;
	this.marks=marks;
}
//getter
public int getR() {
	return this.rollNumber;
}
public String getN() {
	return this.studentName;
}
public int getM() {
	return this.marks;
}
//setter
public void setR(int r) {
	this.rollNumber=r;
}
public void setN(String n) {
	this.studentName=n;
}
public void setM(int m) {
	this.marks=m;
}
}
