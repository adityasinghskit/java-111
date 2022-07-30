package com.masai;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service(value="a1")
public class A {
@Autowired
private List<String> cities;
@Autowired
private List<Student> students;
@Autowired
private Map<Student, String> theMap;
public void show() {
	System.out.println("Inside show of A:");
	System.out.println(cities);
	System.out.println(students);
	System.out.println(theMap);
}
}
