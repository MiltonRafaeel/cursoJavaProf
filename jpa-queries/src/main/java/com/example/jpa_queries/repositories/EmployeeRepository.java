package com.example.jpa_queries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa_queries.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	
}
