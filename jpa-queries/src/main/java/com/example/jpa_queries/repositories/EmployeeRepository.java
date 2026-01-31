package com.example.jpa_queries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.jpa_queries.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	@Query(value = "SELECT obj FROM Employee obj JOIN FETCH obj.department")
	List<Employee> searchAll();
}
