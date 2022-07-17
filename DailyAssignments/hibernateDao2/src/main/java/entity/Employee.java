package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
private int empid;
private String name;
private String address;
private int salary;

public Employee() {
	super();
}

public Employee(int empid, String name, String address, int salary) {
	super();
	this.empid = empid;
	this.name = name;
	this.address = address;
	this.salary = salary;
}

public int getId() {
	return empid;
}

public void setId(int id) {
	this.empid = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
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

@Override
public String toString() {
	return "Employee [empid=" + empid + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
}



}
