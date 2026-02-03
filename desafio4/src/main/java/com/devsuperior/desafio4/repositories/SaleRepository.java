package com.devsuperior.desafio4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.desafio4.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}