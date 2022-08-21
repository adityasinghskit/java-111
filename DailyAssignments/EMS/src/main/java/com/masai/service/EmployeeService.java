package com.masai.service;

import java.util.List;

import com.masai.exception.DeptNotFoundException;
import com.masai.exception.EmployeeNotFoundException;
import com.masai.exception.InvalidIdException;
import com.masai.model.Employee;
import com.masai.model.EmployeeDTO;

public interface EmployeeService {
public Employee addEmployee(Employee employee);
public Employee deleteEmployeeById(Integer id) throws InvalidIdException;
public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException;
public List<Employee> listAllEmployee() throws EmployeeNotFoundException;
public List<Employee> listEmployeeOfDept(String DeptName) throws DeptNotFoundException;
public EmployeeDTO findEmployeeDTOById(Integer id) throws InvalidIdException;
}
