package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class MyController {
@RequestMapping("/hello")
//@ResponseBody
public String sayHello() {
	return "Welcome!";
}
@GetMapping("/student/{roll}/{name}/{marks}")
public Student getStudent(@PathVariable("roll") int rollno,
							@PathVariable("name") String name,
							@PathVariable("marks") int marks) {
	return new Student(rollno, name, marks);
}
@RequestMapping("/students")
public List<Student> getStudents() {
	List<Student> students= new ArrayList<>();
	students.add(new Student(12, "A1", 88));
	students.add(new Student(13, "A2", 98));
	students.add(new Student(14, "A3", 78));
	students.add(new Student(15, "A4", 68));
			return students;
}
}
