package com.masai.service;

import java.util.List;

import com.masai.exception.DepartmentException;
import com.masai.model.Department;
import com.masai.model.DeptName;
import com.masai.model.Employee;

public interface DepartmentService {
	public Department addDepartment(Department dept) throws DepartmentException;
	public List<Employee> findAllEmployee(DeptName deptName) throws DepartmentException;
}
