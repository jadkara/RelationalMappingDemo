package com.org.app.RelationalMappingDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.app.RelationalMappingDemo.domain.Employee;

/**
 * A repository interface to perform CURD operations on {@link Employee} domain
 * 
 * @author Amol Jadkar(amoljadkar007@gmail.com)
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
