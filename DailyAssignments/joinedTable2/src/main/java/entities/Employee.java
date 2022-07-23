package entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="pid")
public class Employee extends Person {
@Embedded
@AttributeOverrides({
	@AttributeOverride(name="state",column=@Column(name="home_state")),
	@AttributeOverride(name="city",column=@Column(name="home_city")),
	@AttributeOverride(name="pincode",column=@Column(name="home_pincode"))
})
private Address homeAddress;
@Embedded
@AttributeOverrides({
	@AttributeOverride(name="state",column=@Column(name="office_state")),
	@AttributeOverride(name="city",column=@Column(name="office_city")),
	@AttributeOverride(name="pincode",column=@Column(name="office_pincode")),
})
private Address officeAddress;
private int salary;
public Employee() {
	super();
}
public Address getHomeAddress() {
	return homeAddress;
}
public void setHomeAddress(Address homeAddress) {
	this.homeAddress = homeAddress;
}
public Address getOfficeAddress() {
	return officeAddress;
}
public void setOfficeAddress(Address officeAddress) {
	this.officeAddress = officeAddress;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [salary=" + salary + "]";
}


}
