package interfaces;

import java.util.List;

import entity.Employee;

public interface EmployeeDao {
	public List<Employee> getAllEmployee();

	public boolean createEmployee(Employee emp);
	
	public String getAddressOfEmployee(int empId);

	public String giveBonusToEmployee(int empId, int bonus);

	public boolean deleteEmployee(int empId);

	public String[] getNameAndAddress(int empId);
 
}
