package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Department;
import com.masai.model.DeptName;
import com.masai.model.Employee;
import com.masai.service.DepartmentService;

@RestController
@RequestMapping("api")
public class DepartmentController {
@Autowired
private DepartmentService dService;

@PostMapping("/departments")
public ResponseEntity<Department> addDepartment(@RequestBody Department dept){
	Department deptAdded= dService.addDepartment(dept);
	return new ResponseEntity<Department>(deptAdded,HttpStatus.ACCEPTED);
}
@GetMapping("/departments/{deptName}/employees")
public ResponseEntity<List<Employee>> findAllEmployee(@PathVariable DeptName deptName){
	List<Employee> list= dService.findAllEmployee(deptName);
	return new ResponseEntity<List<Employee>>(list,HttpStatus.ACCEPTED);
}
}
