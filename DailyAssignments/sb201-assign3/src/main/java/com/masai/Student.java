package com.masai;

import org.springframework.stereotype.Component;

@Component(value="std")
public class Student {
private String name;
private int roll;
private int marks;

public Student() {
	super();
}

public Student(String name, int roll, int marks) {
	super();
	this.name = name;
	this.roll = roll;
	this.marks = marks;
}

@Override
public String toString() {
	return "Student [name=" + name + ", roll=" + roll + ", marks=" + marks + "]";
}



}
