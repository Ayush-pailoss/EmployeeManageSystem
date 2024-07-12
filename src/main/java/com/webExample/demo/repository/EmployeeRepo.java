package com.webExample.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.webExample.demo.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>  {
public List<Employee> findByCityAndName(String city, String name);
public Employee findByNameLike(String name);
@Query("select u form Employee u")
public List<Employee> getallEmployees();
}
