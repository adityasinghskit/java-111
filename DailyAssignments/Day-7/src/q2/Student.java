package q2;

public class Student {
int stuId;
String studName;
double examFee;
public Student() {
	
}
public Student(int id, String name, double efee) {
	this.stuId=id;
	this.studName=name;
	this.examFee=efee;
	}

public void displayDetails() {
	System.out.println("Student details");
	System.out.println("Student ID:"+this.stuId);
	System.out.println("Student Name:"+this.studName);
	System.out.println("Fee: "+this.payFee());
	System.out.println("===============================");
}
public double payFee() {
	return this.examFee;
}

}
class DayScholar extends Student{
	double transportFee;
	public DayScholar() {
		
	}
	public DayScholar(int id, String name, double efee, double tfee) {
		this.stuId=id;
		this.studName=name;
		this.examFee=efee;
		this.transportFee=tfee;
		}
	@Override
	public double payFee() {
		return this.examFee+this.transportFee;
	}
	
}
class Hosteller extends Student{
	double hostelFee;
	public Hosteller() {
		
	}
	public Hosteller(int id, String name, double efee, double hfee) {
	this.stuId=id;
	this.studName=name;
	this.examFee=efee;
	this.hostelFee=hfee;
	}
	@Override
	public double payFee() {
		return this.examFee+this.hostelFee;
	}
}


