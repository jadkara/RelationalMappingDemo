package com.org.app.RelationalMappingDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.org.app.RelationalMappingDemo.domain.Department;
import com.org.app.RelationalMappingDemo.domain.Employee;
import com.org.app.RelationalMappingDemo.service.DepartmentService;
import com.org.app.RelationalMappingDemo.service.EmployeeService;

/**
 * Controller class to calculated values(Employee and Department)
 * @author A.Jadkar
 *
 */
@RestController
@RequestMapping("/api/v1")
public class CustomController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/employees")
	public List<Employee> getEmployees()
	{
		return employeeService.getEmployees();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/employee")
	public Employee createEmployee(@RequestBody Employee employee)
	{
		return employeeService.createEmployee(employee);
	}
	

	@RequestMapping(method = RequestMethod.GET, value = "/departments")
	public List<Department> getDepartments()
	{
		return departmentService.getDepartments();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/department")
	public Department createDepartment(@RequestBody Department department)
	{
		return departmentService.createDepartment(department);
	}
	
	

}
