package employeeDao;

import java.util.List;

import employeeBeanClass.Employee;
import employeeException.EmployeeException;

public interface EmployeeDao {
	public int getSalaryById(int id);
	public List<Employee> getEmployeeInfo() throws EmployeeException;
	public boolean addBonus(int bonus);
	public boolean insertEmployeeWOAddress(int eid, String name, int salary);
	public Employee getEmployeeById(int id) throws EmployeeException; 
	public List<Employee> getEmployeeWithSalaryBelow(int salary) throws EmployeeException;
}
