package com.masai.service;

import java.util.List;

import com.masai.exception.DepartmentException;
import com.masai.exception.EmployeeException;
import com.masai.exception.InvalidIdException;
import com.masai.model.DeptName;
import com.masai.model.Employee;
import com.masai.model.EmployeeDTO;

public interface EmployeeService {
public Employee addEmployee(Employee employee) throws EmployeeException;
public Employee deleteEmployeeById(Integer id) throws InvalidIdException;
public Employee updateEmployee(Employee employee) throws EmployeeException;
public List<Employee> listAllEmployee() throws EmployeeException;
public List<Employee> listEmployeeOfDept(DeptName DeptName) throws DepartmentException;
public EmployeeDTO findEmployeeDTOById(Integer id) throws InvalidIdException;
}
