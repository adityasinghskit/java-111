package entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int empID;
	private String name;
	private String gender;
	private int salary;
	
	@Embedded
	private Address addr;  //here Address obj will be treated as value obj

	public Employee() {
		super();
	}

	public Employee(int empID, String name, String gender, int salary, Address addr) {
		super();
		this.empID = empID;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.addr = addr;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", gender=" + gender + ", salary=" + salary + ", addr="
				+ addr + "]";
	}
	
	
}
