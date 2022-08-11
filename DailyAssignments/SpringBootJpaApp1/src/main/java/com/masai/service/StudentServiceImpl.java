package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entities.Student;
import com.masai.exception.StudentException;
import com.masai.repository.StudentDao;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao sDao;
	
	@Override
	public Student saveStudent(Student student) {
		Student savedStudent= sDao.save(student);
		
		return savedStudent;
	}

	@Override
	public Student getStudentByRoll(Integer roll) throws StudentException {
		Optional<Student> opt=sDao.findById(roll);
		/*if(opt.isPresent()) {
			return opt.get();
		}else {
			throw new StudentException("Student does not exsist of roll: "+roll);
		}*/
		
		return opt.orElseThrow(() -> new StudentException("Student does not exsist of roll: "+roll));
	}

	@Override
	public List<Student> getAllStudentDetails() throws StudentException {
		List<Student> students = sDao.findAll();
		if(students.size()>0) {
			return students;
		}else {
			throw new StudentException("No Student found...");
		}
	}

	@Override
	public Student deleteStudentByRoll(Integer roll) throws StudentException {
		Student existingStudent = sDao.findById(roll).orElseThrow(() -> new StudentException("Student does not exsist of roll: "+roll));
		sDao.delete(existingStudent);
		return existingStudent;
	}

	@Override
	public Student updateStudent(Student student) throws StudentException {
		Optional<Student> opt=sDao.findById(student.getRoll());
		if(opt.isPresent()) {
			return sDao.save(student);
		}else {
			throw new StudentException("Student does not exsist");
		}
	}

	@Override
	public Student updateStudentMarks(Integer roll, Integer graceMarks) throws StudentException {
		Optional<Student> opt=sDao.findById(roll);
		if(opt.isPresent()) {
			Student existingStudent=opt.get();
			existingStudent.setMarks(existingStudent.getMarks()+graceMarks);
			return sDao.save(existingStudent);
		}else
			throw new StudentException("Student does not exsist of roll: "+roll);
	}

	@Override
	public List<Student> getStudentByMarks(Integer marks) throws StudentException {
		List<Student> students=sDao.findByMarks(marks);
		if(students.size()>0)
			return students;
		else
			throw new StudentException("\"Student does not exsist for marks: "+marks);
	}

	@Override
	public String getStudentNameByRoll(Integer roll) throws StudentException {
		String name=sDao.getStudentNameByRoll(roll);
		if(name==null)
			return name;
		else 
			throw new StudentException("Student does not exsist for roll: "+roll);
	}

	@Override
	public String getStudentNameAndMarksByRoll(Integer roll) throws StudentException {
		String name=sDao.getStudentNameAndMarksByRoll(roll);
		if(name==null)
			return name;
		else 
			throw new StudentException("Student does not exsist for roll: "+roll);	}
	
	
	

}
