package com.masai.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.InvalidRollException;
import com.masai.modal.Student;

@RestController
public class MyController {
@GetMapping("/hello")
public ResponseEntity<String> getHello(){
	HttpHeaders hh= new HttpHeaders();
	hh.add("jwt", "ndid8d7s8dn2e8");
	hh.add("user", "local");
	hh.add("message", "12345");
	return new ResponseEntity<>("Hello!",hh,HttpStatus.OK);
}
@GetMapping("/student/{r}")
public Student getStudentDetails0(@PathVariable("r") Integer roll) {
	if(roll<100)
		throw new InvalidRollException("Roll should be greater than 100");
	return new Student(roll,"Adi",88);
}
@GetMapping("/students/{r}/{n}/{m}")
public Student getStudentDetails(@PathVariable("r") Integer roll,
									@PathVariable("n") String name,
									@PathVariable("m") Integer marks){
	
	return new Student(roll, name, marks);
}
@GetMapping("/students")
public Student getStudentDetails2(@RequestParam("r") Integer roll,
									@RequestParam("n") String name,
									@RequestParam("m") Integer marks) {
	return new Student(roll, name, marks);
}
@PostMapping("/postStudent")
public String saveStudentDetails(@RequestBody Student student) {
	return "Saved Student details: "+student;
}
@PutMapping("/putStudent/{r}")
public String updateStudentDetails(@RequestBody Student student, @PathVariable("r") Integer roll) {
	student.setRoll(roll);
	return "updated student: "+student;
}
}

