package com.masai.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.DepartmentException;
import com.masai.exception.EmployeeException;
import com.masai.exception.InvalidIdException;
import com.masai.model.Department;
import com.masai.model.DeptName;
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
	public Employee addEmployee(Employee employee) throws EmployeeException{
		Optional<Employee> opt= eDao.findById(employee.getEid());
		if(!opt.isPresent()) {
			Optional<Department> opt2= Optional.ofNullable(dDao.findByDeptName(opt.get().getDepartment().getDeptName()));
			if(opt2.isPresent()) {
		
				opt2.get().getEmployees().add(employee);
				employee.setDepartment(opt2.get());
				return eDao.save(employee);
			}
			else
				throw new DepartmentException("Department not found!");
		}
		else
			throw new EmployeeException("Employee with that id already present!");
	}

	@Override
	public Employee deleteEmployeeById(Integer id) throws InvalidIdException {
		Optional<Employee> opt = eDao.findById(id);
		if(opt.isPresent()) {
			Department dept= opt.get().getDepartment();
			List<Employee> list= opt.get().getDepartment().getEmployees();
			int ind=0;
			for(Employee e:list) {
				if(e.getEid()==id) {
					list.remove(ind);
					break;
				}
				ind++;
			}

			eDao.delete(opt.get());
			return opt.get();
		}
		else {
			throw new InvalidIdException("Employee not found with id: "+id);
		}
		
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		
		Optional<Employee> opt = eDao.findById(employee.getEid());
		if(opt.isPresent()) {
			Department dept=opt.get().getDepartment();
			List<Employee> list= dept.getEmployees();
			int ind=0;
			for(Employee e:list) {
				if(e.getEid()==employee.getEid()) {
					e.setEid(employee.getEid());
					e.setName(employee.getName());
					e.setSalary(employee.getSalary());
				}
			}
			employee.setDepartment(dept);
			return eDao.save(employee);
		}
		else {
			throw new EmployeeException("Employee not found");
		}
	}

	@Override
	public List<Employee> listAllEmployee() throws EmployeeException {
		List<Employee> list= eDao.findAll();
		if(list.size()>0) {
			return list;
		}
		else {
			throw new EmployeeException("No employee found");
		}
	}

	@Override
	public List<Employee> listEmployeeOfDept(DeptName DeptName) throws DepartmentException {
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
