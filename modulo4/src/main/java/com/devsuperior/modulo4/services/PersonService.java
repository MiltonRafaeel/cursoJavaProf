package com.devsuperior.modulo4.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.modulo4.dto.PersonDTO;
import com.devsuperior.modulo4.dto.PersonDepartmentDTO;
import com.devsuperior.modulo4.entities.Department;
import com.devsuperior.modulo4.entities.Person;
import com.devsuperior.modulo4.repositories.DepartmentRepository;
import com.devsuperior.modulo4.repositories.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;

	@Autowired
	private DepartmentRepository departmentRepository;

	public PersonDepartmentDTO insert(PersonDepartmentDTO dto) {
		Person entity = new Person();
		entity.setName(dto.getName());
		entity.setSalary(dto.getSalary());

		Department dep = departmentRepository.findById(dto.getDepartment().getId()).get();

		//Department dep = new Department();
		//dep.setId(dto.getDepartment().getId());

		entity.setDepartment(dep);
		entity = personRepository.save(entity);
		return new PersonDepartmentDTO(entity);
	}
	
	public PersonDTO insert(PersonDTO dto) {
		Person entity = new Person();
		entity.setName(dto.getName());
		entity.setSalary(dto.getSalary());

		Department dep = departmentRepository.findById(dto.getDepartmentId()).get();

		//Department dep = new Department();
		//dep.setId(dto.getDepartmentId());

		entity.setDepartment(dep);
		entity = personRepository.save(entity);
		return new PersonDTO(entity);
	}
}
