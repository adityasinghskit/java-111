package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.model.Course;
@Repository
public interface CourseDao extends JpaRepository<Course, Integer> {

	public Course findByCname(String cname);
	
//	@Query("from Course c where c.cname=?1")
//	public Course getCourseByName(String cname);
	
}
