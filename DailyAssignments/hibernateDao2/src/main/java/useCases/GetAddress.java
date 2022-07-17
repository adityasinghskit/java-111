package useCases;

import java.util.Scanner;

import entity.Employee;
import interfaces.EmployeeDao;
import interfaces.EmployeeDaoImpl;

public class GetAddress {
public static void main(String[] args) {
	EmployeeDao dao= new EmployeeDaoImpl();
	Scanner sc=new Scanner(System.in);
	
	//createEmployee(new Employee(id,name,city,salary));
	System.out.println("Enter employee id: ");
	int id=sc.nextInt();
	System.out.println("Enter employee name: ");
	String name=sc.next();
	System.out.println("Enter employee city: ");
	String city=sc.next();
	System.out.println("Enter employee salary: ");
	int salary=sc.nextInt();
	boolean b1=dao.createEmployee(new Employee(id,name,city,salary));
	if(b1) System.out.println("Employee inserted");
	else System.out.println("Failed to insert employee");
	
	//getAddressOfEmployee(id2);
	System.out.println("ENter employee id to get address: ");
	int id2=sc.nextInt();
	String add=dao.getAddressOfEmployee(id2);
	System.out.println("Employee address: "+add);
	
	//giveBonusToEmployee(id3, bonus);
	System.out.println("Enter id of employee to give bonus: ");
	int id3=sc.nextInt();
	System.out.println("Enter bonus: ");
	int bonus=sc.nextInt();
	String str=dao.giveBonusToEmployee(id3, bonus);
	System.out.println(str);
	
	//getNameAndAddress(id4);
	System.out.println("Enter id to get name and address:");
	int id4=sc.nextInt();
	String[] str2=dao.getNameAndAddress(id4);
	System.out.println("Employee name: "+str2[0]);
	System.out.println("Employee address: "+str2[1]);
	
	//deleteEmployee(id5);
	System.out.println("Enter id to delete Employee: ");
	int id5=sc.nextInt();
	boolean b2=dao.deleteEmployee(id5);
	if(b2) System.out.println("Record deleted");
	else System.out.println("Error in deleting ");
	
	sc.close();
}
}
