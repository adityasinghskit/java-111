package entities;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.InheritanceType;

@MappedSuperclass
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int eid;
private String name;

public Employee() {
	super();
}

public Employee(int eid, String name) {
	super();
	this.eid = eid;
	this.name = name;
}

public int getEid() {
	return eid;
}

public void setEid(int eid) {
	this.eid = eid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Employee [eid=" + eid + ", name=" + name + "]";
}



}
