package entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int empID;
	private String name;
	private String gender;
	private int salary;
	
	@ElementCollection
	@Embedded
	@JoinTable(name="empaddress",joinColumns=@JoinColumn(name="emp_id"))
	private Set<Address> addresses=new HashSet<Address>();

	public Employee() {
		super();
	}

	public Employee(int empID, String name, String gender, int salary, Set<Address> addresses) {
		super();
		this.empID = empID;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.addresses = addresses;
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

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", gender=" + gender + ", salary=" + salary
				+ ", addresses=" + addresses + "]";
	}

	
}
