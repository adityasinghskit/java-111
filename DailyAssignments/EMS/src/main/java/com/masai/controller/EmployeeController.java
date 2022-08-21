package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Employee;
import com.masai.model.EmployeeDTO;
import com.masai.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
@Autowired
private EmployeeService eService;
@PostMapping("/employees")
public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp){
	Employee employee= eService.addEmployee(emp);
	return new ResponseEntity<Employee>(employee,HttpStatus.ACCEPTED);
}
@DeleteMapping("/employees/{id}")
public ResponseEntity<Employee> deleteEmployeeById(@PathVariable Integer id){
	Employee employee= eService.deleteEmployeeById(id);
	return new ResponseEntity<Employee>(employee,HttpStatus.ACCEPTED);
}
@PutMapping("/employees")
public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp){
	Employee employee= eService.updateEmployee(emp);
	return new ResponseEntity<Employee>(employee,HttpStatus.ACCEPTED);
}
@GetMapping("/employees")
public ResponseEntity<List<Employee>> listAllEmployee(){
	List<Employee> employee= eService.listAllEmployee();
	return new ResponseEntity<List<Employee>>(employee,HttpStatus.ACCEPTED);
}
/*
@GetMapping("/employee/{deptName}")
public ResponseEntity<List<Employee>> findByDeptName(String deptName){
	List<Employee> list= eService.listEmployeeOfDept(deptName);
	return new ResponseEntity<List<Employee>>(list,HttpStatus.ACCEPTED);
}
*/
@GetMapping("/employee/{id}")
public ResponseEntity<EmployeeDTO> findEmployeeDTOById(@PathVariable Integer id){
	EmployeeDTO dto= eService.findEmployeeDTOById(id);
	return new ResponseEntity<EmployeeDTO>(dto,HttpStatus.ACCEPTED);
}
}
