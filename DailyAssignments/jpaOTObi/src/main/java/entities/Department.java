package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int deptId;
private String dname;
private String location;
@OneToOne(mappedBy="dept",cascade = CascadeType.ALL)
@JoinColumn(name="empId")
private Employee employee;
public Department() {
	super();
}
public Department(int deptId, String dname, String location, Employee employee) {
	super();
	this.deptId = deptId;
	this.dname = dname;
	this.location = location;
	this.employee = employee;
}
public int getDeptId() {
	return deptId;
}
public void setDeptId(int deptId) {
	this.deptId = deptId;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}
@Override
public String toString() {
	return "Department [deptId=" + deptId + ", dname=" + dname + ", location=" + location + "]";
}


}
