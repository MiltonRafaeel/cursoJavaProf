package com.devsuperior.modulo4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.modulo4.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
