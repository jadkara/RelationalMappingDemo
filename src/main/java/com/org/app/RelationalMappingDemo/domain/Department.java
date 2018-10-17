package com.org.app.RelationalMappingDemo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Domain class that represents department table.
 * 
 * @author Amol Jadkar
 * 
 * 2018
 *
 */
@Entity
@Table(name = "department")
public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "seq_dept_id")
	@SequenceGenerator(name = "seq_dept_id", sequenceName = "seq_dept_id", allocationSize = 1)
	@Column(name = "department_id")
	private Long departmentId;
	
	@Column(name = "department_name")
	private String departmentName;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	
	public Department(String departmentName) {
		super();
		this.departmentName = departmentName;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	

}
