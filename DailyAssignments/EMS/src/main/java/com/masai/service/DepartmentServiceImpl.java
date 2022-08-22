package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.DepartmentException;
import com.masai.exception.EmployeeException;
import com.masai.model.Department;
import com.masai.model.DeptName;
import com.masai.model.Employee;
import com.masai.repository.DepartmentDao;
@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentDao dDao;
	@Override
	public Department addDepartment(Department dept) throws DepartmentException {
		Optional<Department> opt= Optional.ofNullable(dDao.findByDeptName(dept.getDeptName()));
		if(!opt.isPresent()) {
			dDao.save(dept);
			return dept;
		}
		else
			throw new DepartmentException("Department of that name is already present!");
	}
	@Override
	public List<Employee> findAllEmployee(DeptName deptName) throws DepartmentException {
		Optional<Department> opt= Optional.ofNullable(dDao.findByDeptName(deptName));
		if(opt.isPresent()) {
			List<Employee> list= opt.get().getEmployees();
			if(list.size()>0)
				return list;
			else
				throw new EmployeeException("No employee found in that department");
		}
		else
			throw new DepartmentException("No Department by that name found!");
	}

}
