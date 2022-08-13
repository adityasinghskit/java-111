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

import com.masai.entities.Student;
import com.masai.entities.StudentDTO;
import com.masai.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
private StudentService sService;
	@PostMapping("/")
	public Student saveStudentHandler(@RequestBody Student student) {
		return sService.saveStudent(student);
	}
	
	@GetMapping("/{roll}")
	public Student getStudentHandler(@PathVariable("roll") Integer roll) {
		return sService.getStudentByRoll(roll);
	}
	@GetMapping("/")
	public ResponseEntity<List<Student>> getAllStudentHandler(){
		List<Student> students = sService.getAllStudentDetails();
		return new ResponseEntity<List<Student>>(students,HttpStatus.OK);
	}
	//duplicate API
		/*@GetMapping("/")
		public String getAllStudentHandler2(){
			
			return "Hello";
		}*/
	@DeleteMapping("/{roll}")
	public Student DeleteStudentById(@PathVariable("roll") Integer roll) {
		return sService.deleteStudentByRoll(roll);
	}
	
	@PutMapping("/")
	public ResponseEntity<Student> UpdateStudentHandler(@RequestBody Student student) {
		Student updatedStudent= sService.updateStudent(student);
		return new ResponseEntity<Student>(updatedStudent,HttpStatus.ACCEPTED);
	}
	@PutMapping("/{roll}")
	public ResponseEntity<Student> UpdateStudentMarksHandler(@RequestParam("marks") Integer marks,
																@PathVariable("roll") Integer roll) {
		Student updatedStudent= sService.updateStudentMarks(roll,marks);
		return new ResponseEntity<Student>(updatedStudent,HttpStatus.ACCEPTED);
	}
	@GetMapping("/getbymarks/{marks}")
	public List<Student> getStudentByMarks(@PathVariable("marks") Integer marks){
		return sService.getStudentByMarks(marks);
	}
	@GetMapping("/getnamebyroll/{roll}")
	public String getStudentNameByRoll(@PathVariable("roll") Integer roll){
		return sService.getStudentNameByRoll(roll);
	}
	@GetMapping("/getnamemarksbyroll/{roll}")
	public String getStudentNameAndMarksByRoll(@PathVariable("roll") Integer roll){
		return sService.getStudentNameByRoll(roll);
	}
	@GetMapping("/getstudentdtobyroll/{roll}")
	public StudentDTO getStudentDTOByRoll(@PathVariable("roll") Integer roll){
		return sService.getStudentDTOByRoll(roll);
	}
}
