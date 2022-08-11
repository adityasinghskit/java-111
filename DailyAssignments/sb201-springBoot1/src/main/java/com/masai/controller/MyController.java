package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;



//@Controller
@RestController
public class MyController {
@GetMapping("/hello")
//@ResponseBody
public ResponseEntity<String> sayHello() {
	HttpHeaders hh=new HttpHeaders();
	hh.add("jwt", "shd7s8dsd9sud");
	hh.add("user", "local");
	hh.add("hello", "12345");
	return new ResponseEntity<String>("welcome", hh, HttpStatus.OK);
}
@GetMapping("/getStudent")
public Student getStudent1(@RequestParam("r") Integer rollno,
							@RequestParam("n") String name,
							@RequestParam("m") Integer marks) {
	return new Student(rollno, name, marks);
}
@GetMapping("/student/{roll}/{name}/{marks}")
public Student getStudent2(@PathVariable("roll") Integer rollno,
							@PathVariable("name") String name,
							@PathVariable("marks") Integer marks) {
	return new Student(rollno, name, marks);
}
@GetMapping("/students")
public List<Student> getStudents() {
	List<Student> students= new ArrayList<>();
	students.add(new Student(12, "A1", 88));
	students.add(new Student(13, "A2", 98));
	students.add(new Student(14, "A3", 78));
	students.add(new Student(15, "A4", 68));
			return students;
}
//Sending POST request
@PostMapping(value = "/postStudent",consumes = "application/json")
public String saveStudenthandler(@Valid @RequestBody Student student) {
//here we can communicate with the Service layer or Data Access Layer classes to
//persist the Student object in the Database.
return "Student stored ,"+student;
}
//Sending PUT request
@PutMapping(value = "/updateStudent/{roll}")
public Student updateStudentHandler(@RequestBody Student student,@PathVariable("roll")int rollno) {
student.setMarks(student.getMarks()+10);
student.setRoll(rollno);
return student;
}


}
