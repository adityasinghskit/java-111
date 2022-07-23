package entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="eid")
public class SalaryEmployee extends Employee {
private int salary;

public SalaryEmployee() {
	super();
}

public SalaryEmployee(int salary) {
	super();
	this.salary = salary;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "SalaryEmployee [salary=" + salary + "]";
}


}
