package questions;

import java.util.List;
import java.util.Scanner;

import employeeBeanClass.Employee;
import employeeDao.EmployeeDao;
import employeeDao.EmployeeDaoImpl;

public class Q6GetEmployeeWSalaryBelow {
public static void main(String[] args) {
	EmployeeDao dao= new EmployeeDaoImpl();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the salary below which you want results");
	int salary=sc.nextInt();
	sc.close();
	try {
		List<Employee> l=dao.getEmployeeWithSalaryBelow(salary);
		l.forEach(e ->{
			System.out.println("Employee eid: "+e.getEid());
			System.out.println("Employee name: "+e.getName());
			System.out.println("Employee address: "+e.getAddress());
			System.out.println("Employee salary: "+e.getSalary());
			System.out.println("===============================");
		});
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
