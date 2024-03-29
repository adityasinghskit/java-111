package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.StudentException;
import com.masai.model.Student;
import com.masai.model.StudentDTO;
import com.masai.repository.StudentDao;

@Service
public class StudentServiceImpl implements StudentService{

	
	@Autowired
	private StudentDao sDao;
	
	
	@Override
	public Student saveStudent(Student student) throws StudentException {
	Optional<Student> opt= sDao.findById(student.getRoll());
	if(opt.isEmpty()) {
		return sDao.save(student);
	}else {
		throw new StudentException("Student is already registered with roll"+student.getRoll());
	}
	
	}

	@Override
	public Student getStudentByRoll(Integer roll) throws StudentException {
		
		Optional<Student> opt =  sDao.findById(roll);
		
//		if(opt.isPresent()) {
//			return opt.get();
//		}else
//			throw new StudentException("Student does not exist with Roll "+roll);
		

		return opt.orElseThrow(() -> new StudentException("Student does not exist with Roll "+roll));
		
	}

	@Override
	public List<Student> getAllStudentDetails() throws StudentException {
	
		List<Student> students= sDao.findAll();
		
		if(students.size() > 0)
			return students;
		else
			throw new StudentException("No Student Found.");
		
	}

	@Override
	public Student deleteStudentByRoll(Integer roll) throws StudentException {
		
		 Student existingStudent= sDao.findById(roll).orElseThrow(() -> new StudentException("Student does not exist with Roll "+roll));
		
		sDao.delete(existingStudent);
		
		return existingStudent;
		
	}

	@Override
	public Student updateStudent(Student student) throws StudentException {
		
		Optional<Student> opt= sDao.findById(student.getRoll());
		
		if(opt.isPresent()) {
			
			//Student existingStudent= opt.get();
			
			return sDao.save(student);
			
			
			
			//save or update based on Id feild
			
					
		}else
			throw new StudentException("Invalid Student Details");
		
	}

	@Override
	public Student updateStudentMarks(Integer roll, Integer graceMarks) throws StudentException {
		
		Optional<Student> opt= sDao.findById(roll);
		
		
		if(opt.isPresent()) {
			
			Student existingStudent= opt.get();
			
			
			existingStudent.setMarks(existingStudent.getMarks()+graceMarks);
			
			return sDao.save(existingStudent);
			
			
		}else
			throw new StudentException("Student does not exist with Roll :"+roll);
		
	}

	@Override
	public Student getStudentsByMarks(Integer marks) throws StudentException {
		
		
		Student student= sDao.findByMarks(marks);
		
		if(student != null)
			return student;
		else
			throw new StudentException("No Student found..");
	
	}
	
	@Override
	public String getStudentNameByRoll(Integer roll) throws StudentException {
		
		String name= sDao.getStudentNameByRoll(roll);
		
		if(name != null)
			return name;
		else
			throw new StudentException("Student not found with Roll :"+roll);
		
	}

	@Override
	public StudentDTO getStudentNameAndMarksbyRoll(Integer roll) throws StudentException {
		
		StudentDTO result= sDao.fun1(roll);
		
		if(result != null)
			return result;
		else
			throw new StudentException("Student does not exist with roll :"+roll);
		
	}

	
	
	
	
	
	
	
}
