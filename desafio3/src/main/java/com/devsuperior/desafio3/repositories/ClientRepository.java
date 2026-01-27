package com.devsuperior.desafio3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.desafio3.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	
}