package questions;


import java.util.Scanner;

import employeeDao.EmployeeDao;
import employeeDao.EmployeeDaoImpl;

public class Q4AddEmployeeWOAddress {
public static void main(String[] args) {
	EmployeeDao dao= new EmployeeDaoImpl();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter employee eid: ");
	int eid=sc.nextInt();
	System.out.println("Enter employee name: ");
	String name=sc.next();
	System.out.println("Enter employee salary: ");
	int salary=sc.nextInt();
	sc.close();
	try {
		Boolean b= dao.insertEmployeeWOAddress(eid, name, salary);
		if(b)
			System.out.println("Employee inserted successfully");
		else
			System.out.println("Failed to insert");
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
