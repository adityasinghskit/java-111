package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.masai.entities.Student;
@Repository
//The implementation of methods is given by Spring data jpa
public interface StudentDao extends JpaRepository<Student, Integer> {
	public List<Student> findByMarks(Integer marks);
	
	@Query("select s.name from Student s where s.roll=:roll")
	public String getStudentNameByRoll(@Param("roll") Integer roll);
	
	@Query("select s.name,s.marks from Student s where s.roll=1")
	public String getStudentNameAndMarksByRoll(Integer roll);
	
	/*@Query("select new com.masai.entities.StudentDTO(s.name,s.marks) from Student s where s.roll=:roll")
	public StudentDTO getStudentDTONameAndMarksByRoll(@Param("roll") Integer roll);*/
}
