package q4;

public class Person {
String name;
String gender;

int instructorId;
int salary;
int studentId;
String courseEnrolled;
int courseFee;
Address address;
@Override
public String toString() {
	return "Person [name=" + name + ", gender=" + gender + "]";
}

}

class Address {
String city;
String state;
String pinCode;
Address(){
	
}
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + ", pinCode=" + pinCode + "]";
}

}

class Instructor extends Person{
	int instructorId;
	int salary;
	Address address;
	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
}
class Student extends Person{
	int studentId;
	String courseEnrolled;
	int courseFee;
	Address address;
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
				+ ", address=" + address + "]";
	}
	
	
	
}
