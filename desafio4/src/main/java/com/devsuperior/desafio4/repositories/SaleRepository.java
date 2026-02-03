package com.devsuperior.desafio4.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.devsuperior.desafio4.dto.SaleMinDTO;
import com.devsuperior.desafio4.dto.SaleSummaryDTO;
import com.devsuperior.desafio4.entities.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT new com.devsuperior.desafio4.dto.SaleMinDTO(obj.id, obj.amount, obj.date, obj.seller.name) " +
		       "FROM Sale obj " +
		       "WHERE obj.date >= :min " +
		       "AND obj.date <= :max " +
		       "AND UPPER(obj.seller.name) LIKE UPPER(CONCAT('%', :name, '%'))")
		Page<SaleMinDTO> searchReport(LocalDate min, LocalDate max, String name, Pageable pageable);

	@Query("SELECT new com.devsuperior.desafio4.dto.SaleSummaryDTO(obj.seller.name, SUM(obj.amount)) " +
		       "FROM Sale obj " +
		       "WHERE obj.date BETWEEN :minDate AND :maxDate " +
		       "GROUP BY obj.seller.name")
		List<SaleSummaryDTO> searchSummary(LocalDate minDate, LocalDate maxDate);

}