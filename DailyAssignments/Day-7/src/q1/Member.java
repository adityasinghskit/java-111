package q1;

public class Member {
String name;
int age;
String phoneNumber;
String address;
double salary;
public void printSalary() {
	System.out.println("Salary is: "+this.salary);
}
public void print() {
	System.out.println("Details of employee:" );
	System.out.println("Name: "+this.name);
	System.out.println("Age: "+this.age);
	System.out.println("Phone number: "+this.phoneNumber);
	System.out.println("Address: "+this.address);
	printSalary();
	System.out.println("=============================");
}
}
class Employee extends Member{
	String specialisation;
	String department;
	
}
class Manager extends Member{
	String specialisation;
	String department;
	
}