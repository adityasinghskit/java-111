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
@Entity
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int deptId;
private String dname;
private String location;
@OneToMany(mappedBy="dept",cascade = CascadeType.ALL)
private List<Employee> employees= new ArrayList<Employee>();
public Department() {
	super();
}
public Department(int deptId, String dname, String location, List<Employee> employees) {
	super();
	this.deptId = deptId;
	this.dname = dname;
	this.location = location;
	this.employees = employees;
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
public List<Employee> getEmployees() {
	return employees;
}
public void setEmployees(List<Employee> employees) {
	this.employees = employees;
}
@Override
public String toString() {
	return "Department [deptId=" + deptId + ", dname=" + dname + ", location=" + location + "]";
}


}
