package com.masai.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
@Min(value=1, message="{roll.invalid}")
@Max(value=1000, message="{roll.invalid}")
private Integer roll;
@NotNull
@Size(min=3, max=16, message="{name.invalid}")
private String name;
@Min(value=1, message="Marks should be more than 0")
@Max(value=100, message="Marks should not be more than 100")
private Integer marks;
//private Address address;
public Student() {
	super();
}
public Student(Integer roll, String name, Integer marks) {
	super();
	this.roll = roll;
	this.name = name;
	this.marks = marks;
}
public Integer getRoll() {
	return roll;
}
public void setRoll(Integer roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getMarks() {
	return marks;
}
public void setMarks(Integer marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
}






}
