package com.devsuperior.modulo4.dto;

import com.devsuperior.modulo4.entities.Department;

public class DepartmentDTO {
	
	private Long id;
	private String name;
	
	public DepartmentDTO() {
		super();
	}
	
	public DepartmentDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public DepartmentDTO(Department entity) {
		super();
		id = entity.getId();
		name = entity.getName();
	}
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}	
}
