package q1;

import java.util.Scanner;

public class Employee {
private int employeeId;
private String employeeName;
private double salary;
private double netSalary;
/*Employee(int i, String n, double s, double net){
	this.employeeId=i;
	this.employeeName=n;
	this.salary=s;
	this.netSalary=net;
}*/
Employee(){
	
}
//getter
public int getId() {
	return this.employeeId;
}
public String getName() {
	return this.employeeName;
}
public double getSalary() {
	return this.salary;
}
public double getNet() {
	return this.netSalary;
}
//setter
public void setId(int i) {
	this.employeeId=i;
}
public void setName(String n) {
	this.employeeName=n;
}
public void setSalary(double s) {
	this.salary=s;
}
public void setNet(double net) {
	this.netSalary=net;
}
public void calculateNetSalary(int pfpercentage) {
	int per=100-pfpercentage;
	this.netSalary=this.salary*per/100;
}
public void showDetails() {
	System.out.println("Employee details:");
	System.out.println("Id: "+this.getId());
	System.out.println("Name: "+this.getName());
	System.out.println("Salary: "+this.getSalary());
	System.out.println("Net salary: "+this.getNet());
}
}

