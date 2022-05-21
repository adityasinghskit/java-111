package q4;

public class Student {
//private members
private int roll;
private String name;
private String address;
private int marks;
Student(){
	
}
//setter
public void setRoll(int r) {
	this.roll=r;
}
public void setName(String n) {
	this.name=n;
}
public void setAddress(String add) {
	this.address=add;
}
public void setMarks(int m) {
	this.marks=m;
}
//getter
public int getRoll() {
	return this.roll;
}
public String getName() {
	return this.name;
}
public String getAddress() {
	return this.address;
}
public int getMarks() {
	return this.marks;
}
public void showDetails() {
	System.out.println("roll:"+this.getRoll());
	System.out.println("name:"+this.getName());
	System.out.println("address:"+this.getAddress());
	System.out.println("marks:"+this.getMarks());
}
}
