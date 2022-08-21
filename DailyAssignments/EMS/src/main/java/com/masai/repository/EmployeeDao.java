package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.model.Employee;
import com.masai.model.EmployeeDTO;
@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	//@Query("From employee where department.DeptName=:deptName")
	//public List<Employee> findByDeptName(String deptName);
	
	@Query("select new com.masai.model.EmployeeDTO(e.name,e.salary) from Employee e where e.eid=?1")
	public EmployeeDTO findEmployeeDTOById(Integer id);
}
