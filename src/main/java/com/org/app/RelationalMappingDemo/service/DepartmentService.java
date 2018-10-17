package com.org.app.RelationalMappingDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.app.RelationalMappingDemo.domain.Department;
import com.org.app.RelationalMappingDemo.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public List<Department> getDepartments()
	{
		return departmentRepository.findAll();
	}
	
	public Department createDepartment(Department department)
	{
		return departmentRepository.save(department);
	}
	

}
