package entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int empId;
private String ename;
private String address;
private int salary;
@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name="deptId")
private Department dept;

public Employee() {
	super();
}

public Employee(int empId, String ename, String address, int salary, Department dept) {
	super();
	this.empId = empId;
	this.ename = ename;
	this.address = address;
	this.salary = salary;
	this.dept = dept;
}

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public Department getDept() {
	return dept;
}

public void setDept(Department dept) {
	this.dept = dept;
}

@Override
public String toString() {
	return "Employee [empId=" + empId + ", ename=" + ename + ", address=" + address + ", salary=" + salary + ", dept="
			+ dept + "]";
}

}
