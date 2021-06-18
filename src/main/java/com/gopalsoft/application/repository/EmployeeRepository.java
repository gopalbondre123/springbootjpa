package com.gopalsoft.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gopalsoft.application.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
	