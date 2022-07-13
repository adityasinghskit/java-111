package questions;

import java.util.Scanner;

import employeeBeanClass.Employee;
import employeeDao.EmployeeDao;
import employeeDao.EmployeeDaoImpl;
import employeeException.EmployeeException;

public class Q5GetEmployeeById {
public static void main(String[] args) {
	EmployeeDao dao= new EmployeeDaoImpl();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Employee eid to search");
	int eid= sc.nextInt();
	sc.close();
	try {
		Employee e= dao.getEmployeeById(eid);
		if(e!=null) {
		System.out.println("Employee eid: "+e.getEid());
		System.out.println("Employee name: "+e.getName());
		System.out.println("Employee address: "+e.getAddress());
		System.out.println("Employee salary: "+e.getSalary());
		}else {
			System.out.println("No employee with that id found");
		}
	} catch (EmployeeException e) {
		System.out.println(e.getMessage());
	}
}
}
