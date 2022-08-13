package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.masai.model.Student;
import com.masai.model.StudentDTO;

@Repository
public interface StudentDao extends JpaRepository<Student,Integer>{

	public Student findByMarks(int marks);
	
	//public List<Student> findByMarks(int marks);
	
	@Query("select s.name from Student s where s.roll=:roll")        
	public String getStudentNameByRoll(@Param("roll") int roll);

	
	@Query("select new com.masai.model.StudentDTO(s.name,s.marks) from Student s where s.roll=?1")        
	public StudentDTO fun1(int roll);

		
	
	
	
	
	
	
	
	
	
	
}
