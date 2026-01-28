package com.devsuperior.modulo4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.modulo4.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
