package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;
import com.masai.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService sService;
	
	/*
	
	{
	    "name": "Ajay",
	    "marks": 750,
	    "courses": [

	            {
	                "cname": "Java",
	                "fee": 8000
	            },
	            {
	                "cname": "Angular",
	                "fee": 5000
	            }


	    ]
	}
	
	
	*/
	
	@PostMapping("/students")
	public Student registerStudentHandler(@RequestBody Student student) {
		
		return sService.saveStudent(student);
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
