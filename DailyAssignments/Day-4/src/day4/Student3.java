package day4;
class Demo1{
	public static void main(String[] args) {
		Student3 s1=new Student3();
		Student3 s2=s1.getStudent(true);
		s2.studentDetails();
		System.out.println(s2.getCollege());
	}
}
public class Student3 {
private int roll;
private String name;
private String address;
private String collegeName;

Student3(int r, String n, String a){
	this.roll=r;
	this.name=n;
	this.address=a;
	this.collegeName="NIT";
}
Student3(int r, String n, String a, String c){
	this.roll=r;
	this.name=n;
	this.address=a;
	this.collegeName=c;
}
Student3(){
	
}
public int getRoll() {
	return this.roll;
}
public void setRoll(int n) {
	this.roll=n;
}
public String getName() {
	return this.name;
}
public void setName(String n) {
	this.name=n;
}
public String getAddress() {
	return this.address;
}
public void setAddress(String n) {
	this.address=n;
}
public String getCollege() {
	return this.collegeName;
}
public void setCollege(String n) {
	this.collegeName=n;
}
public Student3 getStudent(boolean isFromNIT) {
	if(isFromNIT==true) {
		 return new Student3(11,"Ali","112-C");
		
	}else {
		return new Student3(11,"Ali","112-C","IIT");
	}
}
public void studentDetails() {
	System.out.println("Student rollno:"+this.getRoll());
	System.out.println("Student name:"+this.getName());
	System.out.println("Student address:"+this.getAddress());
	System.out.println("Student college:"+this.getCollege());
}
public static void main(String[] args) {
	
}

}

