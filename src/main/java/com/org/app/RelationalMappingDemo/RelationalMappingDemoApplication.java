package com.org.app.RelationalMappingDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.org.app.RelationalMappingDemo.domain.Department;
import com.org.app.RelationalMappingDemo.domain.Employee;
import com.org.app.RelationalMappingDemo.service.DepartmentService;
import com.org.app.RelationalMappingDemo.service.EmployeeService;

@SpringBootApplication
public class RelationalMappingDemoApplication implements CommandLineRunner{
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private DepartmentService departmentService;

	public static void main(String[] args) {
		SpringApplication.run(RelationalMappingDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		employeeService.createEmployee(new Employee("Abcd", "Pqrs"));
		employeeService.createEmployee(new Employee("Lmn", "Lmn"));
		employeeService.createEmployee(new Employee("XYZ", "XYZ"));
		
		
		departmentService.createDepartment(new Department("Sales"));
		departmentService.createDepartment(new Department("Purchase"));
		
		
		
	}
}
