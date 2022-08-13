package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;
import com.masai.service.StudentService;

@RestController
public class CourseController {

	
	@Autowired
	private StudentService sService;
	
	
	@PostMapping("/courses/{cname}")
	public Student registerStudentInCourseHandler(@PathVariable("cname") String cname,@RequestBody Student student) {
		
		
		
		return sService.registerStudentInCourse(cname, student);
		
		
	}
	
	
}
