package com.webExample.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementSystemApp implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		print();
	}
	
	
	
	public void print() {
		
		try {
		System.out.println("This is try block");
		}catch (Exception e) {
			System.out.println("This is catch block");
		}
		
		finally {
			System.out.println("This is final");
		}
	}

}
