package com.org.app.RelationalMappingDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.app.RelationalMappingDemo.domain.Employee;
import com.org.app.RelationalMappingDemo.repository.EmployeeRepository;

/**
 * Service class 
 * 
 * 2018
 * 
 * @author Amol Jadkar(amoljadkar007@gmail.com)
 *
 */
@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getEmployees()
	{
		return employeeRepository.findAll();
	}
	
	public Employee createEmployee(Employee employee)
	{
		return employeeRepository.save(employee);
	}

}
