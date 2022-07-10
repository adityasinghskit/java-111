package questions;

import java.util.Scanner;

import employeeDao.EmployeeDao;
import employeeDao.EmployeeDaoImpl;

public class Q1getSalaryById {
public static void main(String[] args) {
	EmployeeDao dao=new EmployeeDaoImpl();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter employee id to get salary: ");
	int s=sc.nextInt();
	sc.close();
	try {
		int salary=dao.getSalaryById(s);
		System.out.println("Employee salary is "+salary);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}