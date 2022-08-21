package com.masai.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.DeptNotFoundException;
import com.masai.exception.EmployeeNotFoundException;
import com.masai.exception.InvalidIdException;
import com.masai.model.Department;
import com.masai.model.Employee;
import com.masai.model.EmployeeDTO;
import com.masai.repository.DepartmentDao;
import com.masai.repository.EmployeeDao;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao eDao;
	
	@Autowired
	private DepartmentDao dDao;
	
	@Override
	public Employee addEmployee(Employee employee) {
		
		return eDao.save(employee);
	}

	@Override
	public Employee deleteEmployeeById(Integer id) throws InvalidIdException {
		Optional<Employee> opt = eDao.findById(id);
		if(opt.isPresent()) {
			Employee emp= opt.get();
			eDao.delete(opt.get());
			return emp;
		}
		else {
			throw new InvalidIdException("Employee not found with id: "+id);
		}
		
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException {
		
		Optional<Employee> opt = eDao.findById(employee.getEid());
		if(opt.isPresent()) {
			Employee emp= opt.get();
			//Department dept=emp.getDepartment();
			//dDao.save(dept);
			eDao.save(emp);
			return emp;
		}
		else {
			throw new EmployeeNotFoundException("Employee not found");
		}
	}

	@Override
	public List<Employee> listAllEmployee() throws EmployeeNotFoundException {
		List<Employee> list= eDao.findAll();
		if(list.size()>0) {
			return list;
		}
		else {
			throw new EmployeeNotFoundException("No employee found");
		}
	}

	@Override
	public List<Employee> listEmployeeOfDept(String DeptName) throws DeptNotFoundException {
		/*List<Employee> list=eDao.findByDeptName(DeptName);
		if(list.size()>0) {
			return list;
		}
		else {
			throw new EmployeeNotFoundException("No employee found");
		}*/
		return null;
	}

	@Override
	public EmployeeDTO findEmployeeDTOById(Integer id) throws InvalidIdException {
		Optional<Employee> opt= eDao.findById(id);
		if(opt.isPresent()) {
			EmployeeDTO dto= eDao.findEmployeeDTOById(id);
			return dto;
		}
		else
			throw new InvalidIdException("Employee not found with id: "+id);
		
	}

}
