package com.webExample.demo.empcontroller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webExample.demo.entity.Employee; 
import com.webExample.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
@Autowired
EmployeeService service;


@GetMapping
public List<Employee> listOfEmp(){
	return service.listOfEmployees();
}

@PostMapping
  public Employee saveEmployee(@RequestBody Employee employee) {
	return service.addEmployee(employee);
}

@GetMapping("/{id}")

public Optional<Employee> getEmployeeById(@PathVariable int id) {
	try {
		return service.getEmployee(id);
	} catch (Exception e) {
		System.out.println((e.getMessage()));
	}
	return service.getEmployee(id);
}
@PutMapping("/{id}")
public Employee updateEmployeeDetails(@RequestBody Employee employe, @PathVariable int id) {
	return service. updateEmployee(employe, id) ;
	 
}
@DeleteMapping("/{id}")
public void removeEmp(@PathVariable int id) {
	service.removeEmployee(id);
}
}