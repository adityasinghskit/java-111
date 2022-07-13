package questions;

import java.util.List;

import employeeBeanClass.Employee;
import employeeDao.EmployeeDao;
import employeeDao.EmployeeDaoImpl;
import employeeException.EmployeeException;

public class Q2GetAllEmployeeDetails {
public static void main(String[] args) {
	EmployeeDao dao=new EmployeeDaoImpl();
	try {
		List<Employee> ls=dao.getEmployeeInfo();
		ls.forEach(s ->{
			System.out.println("Employee eid: "+s.getEid());
			System.out.println("Employee name: "+s.getName());
			System.out.println("Employee address: "+s.getAddress());
			System.out.println("Employee salary: "+s.getSalary());
			System.out.println("================================");
		});
		
	} catch (EmployeeException e) {
		System.out.println(e.getMessage());
	}
}
}
