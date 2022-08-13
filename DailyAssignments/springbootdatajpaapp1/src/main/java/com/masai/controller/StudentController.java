package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.StudentException;
import com.masai.model.Student;
import com.masai.model.StudentDTO;
import com.masai.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private  StudentService sService;
	
	
	
	@PostMapping("/")
	public ResponseEntity<Student> saveStudentHandler(@RequestBody Student student) {
		
		Student savedStudent =  sService.saveStudent(student);
		
		
		
		return new ResponseEntity<Student>(savedStudent,HttpStatus.CREATED);
		
	}
	
	
	

	
	
	@GetMapping("/{roll}")
	public Student getStudenthandler(@PathVariable("roll") Integer roll) {
		
		return sService.getStudentByRoll(roll);
		
		
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Student>> getAllStudentHandler() {
		
		List<Student> students= sService.getAllStudentDetails();
		
		return new ResponseEntity<List<Student>>(students,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/{roll}")
	public Student deleteStudentById(@PathVariable("roll") Integer roll)  {
		
		return sService.deleteStudentByRoll(roll);
	}
	
	@PutMapping("/")
	public ResponseEntity<Student> updateStudentHandler(@RequestBody Student student) {
		
		Student updatedStudent= sService.updateStudent(student);
		
		
		return new ResponseEntity<Student>(updatedStudent,HttpStatus.ACCEPTED);
		
	}
	
	@PutMapping("/{roll}")
	public ResponseEntity<Student> updateStudentMarksHandler(@PathVariable("roll") Integer roll, @RequestParam("marks") Integer gMarks){
		
		
		Student updatedStudent= sService.updateStudentMarks(roll, gMarks);
		
		return new ResponseEntity<Student>(updatedStudent,HttpStatus.ACCEPTED);	
	}
	
	//localhost:8888/students/testapi/780
	@GetMapping("/testapi/{marks}")
	public Student getStudentbyMarksHandler(@PathVariable("marks") Integer marks){
		
		return sService.getStudentsByMarks(marks);
		
	}
	
	
	@GetMapping("/testapi2/{roll}")
	public  String getStudentNamebyRollHandler(@PathVariable("roll") Integer roll){
		
		return sService.getStudentNameByRoll(roll);
		
	}
	
	@GetMapping("/testapi3/{roll}")
	public  StudentDTO getStudentNameAndMarksbyRollHandler(@PathVariable("roll") Integer roll){
		
		return sService.getStudentNameAndMarksbyRoll(roll);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
