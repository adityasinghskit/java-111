package com.masai.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.InvalidRollException;
import com.masai.model.Student;

@RestController
public class StudentController {
@GetMapping("/student/{roll}")
public Student getStudentDetails(@PathVariable Integer roll) {
	if(roll<1)
		throw new InvalidRollException("roll should be greater than 1");
	
	return new Student(roll, "Adi",99);
}

}
