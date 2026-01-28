package com.devsuperior.modulo4.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.modulo4.dto.PersonDepartmentDTO;
import com.devsuperior.modulo4.entities.Department;
import com.devsuperior.modulo4.entities.Person;
import com.devsuperior.modulo4.repositories.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	public PersonDepartmentDTO insert (PersonDepartmentDTO dto) {
		Person entity = new Person();
		entity.setName(dto.getName());
		entity.setSalary(dto.getSalary());
		
		Department dep = new Department();
		dep.setId(dto.getDepartment().getId());
		
		entity.setDepartment(dep);
		entity = personRepository.save(entity);
		return new PersonDepartmentDTO(entity);
	}
}
