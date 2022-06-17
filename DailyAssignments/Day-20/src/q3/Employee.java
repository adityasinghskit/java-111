package q3;

public class Employee {
private int empId;
private String empName;
private int salary;
public Employee() {
	super();
}
public Employee(int empId, String empName, int salary) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.salary = salary;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
}

}
