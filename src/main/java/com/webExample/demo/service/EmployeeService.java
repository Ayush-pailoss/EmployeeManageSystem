package com.webExample.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.webExample.demo.entity.Employee;
import com.webExample.demo.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo repo;
	
	public Employee addEmployee(Employee emp) {
		return repo.save(emp) ;	
	}
	public Optional<Employee> getEmployee(int id) {
		return repo.findById(id);	
	}
	public List<Employee> listOfEmployees() {
		return repo.findAll();
	}
	
	public void removeEmployee(int id) {
		repo.deleteById(id);
	}
	@SuppressWarnings("deprecation")
	public Employee updateEmployee(Employee empdetails,int id) {
		Employee employee = repo.getById(id);
		employee.setName(empdetails.getName());
		employee.setCity(empdetails.getCity());
		return repo.save(employee);
	}
}
