package entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="eid")
public class ContractualEmployee extends Employee{
private int noOfWorkingDays;
private int costPerDay;
public ContractualEmployee() {
	super();
}
public ContractualEmployee(int noOfWorkingDays, int costPerDay) {
	super();
	this.noOfWorkingDays = noOfWorkingDays;
	this.costPerDay = costPerDay;
}
public int getNoOfWorkingDays() {
	return noOfWorkingDays;
}
public void setNoOfWorkingDays(int noOfWorkingDays) {
	this.noOfWorkingDays = noOfWorkingDays;
}
public int getCostPerDay() {
	return costPerDay;
}
public void setCostPerDay(int costPerDay) {
	this.costPerDay = costPerDay;
}
@Override
public String toString() {
	return "ContractualEmployee [noOfWorkingDays=" + noOfWorkingDays + ", costPerDay=" + costPerDay + "]";
}


}
