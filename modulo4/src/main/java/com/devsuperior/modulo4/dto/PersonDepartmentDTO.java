package com.devsuperior.modulo4.dto;

import com.devsuperior.modulo4.entities.Person;

public class PersonDepartmentDTO {

	private Long id;
	private String name;
	private Double salary;

	private DepartmentDTO department;
	
	public PersonDepartmentDTO() {
		super();
	}

	public PersonDepartmentDTO(Long id, String name, Double salary, DepartmentDTO department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public PersonDepartmentDTO(Person entity) {
		super();
		id = entity.getId();
		name = entity.getName();
		salary = entity.getSalary();
		department = new DepartmentDTO(entity.getDepartment());
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}

	public DepartmentDTO getDepartment() {
		return department;
	}
}
