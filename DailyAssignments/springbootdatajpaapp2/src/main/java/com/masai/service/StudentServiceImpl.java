package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.CourseException;
import com.masai.model.Course;
import com.masai.model.Student;
import com.masai.repository.CourseDao;
import com.masai.repository.StudentDao;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao sDao;
	
	@Autowired
	private CourseDao cDao;
	
	
	@Override
	public Student saveStudent(Student student) {
		
		
		
		List<Course> courses= student.getCourses();
		
		for(Course course:courses) {
			
			//associating each course with the student
			course.getStudents().add(student);
			cDao.save(course);
		}
		
		return sDao.save(student);
		
		
		
	}


	

	@Override
	public Student registerStudentInCourse(String cname, Student student) {
		
		Course course= cDao.findByCname(cname);
		
		if(course != null) {
		
		course.getStudents().add(student);
		student.getCourses().add(course);
		
		
		return sDao.save(student);
	}
	else 
		throw new CourseException("Course Does not exist with Cname "+cname );
		
	}

}
