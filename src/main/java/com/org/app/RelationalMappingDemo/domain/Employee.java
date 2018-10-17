package com.org.app.RelationalMappingDemo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author A.Jadkar
 *
 */
@Entity
@Table(name = "emplopyee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_emp_id")
	@SequenceGenerator(name = "seq_emp_id", sequenceName = "seq_emp_id", allocationSize = 1)
	@Column(name = "employee_id")
	private Long employeeId;
	
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	public Employee() {
		
	}

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
	
	
	
 

}
