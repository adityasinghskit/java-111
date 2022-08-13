package com.masai.service;

import com.masai.model.Student;

public interface StudentService {
	
	public Student saveStudent(Student student);
	
	public Student registerStudentInCourse(String cname, Student student);

}
