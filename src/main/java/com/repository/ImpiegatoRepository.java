package com.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.Impiegato;



@Repository("impiegatoRepository")
public interface ImpiegatoRepository extends JpaRepository<Impiegato, Integer> {

	List<Impiegato> findByCognome(String cognome);
	Impiegato findByCodicefiscale(String codicefiscale);
	
//	int countByFirstName(String firstName);
//	List<Customer> findByFirstNameAndLastName(String firstName, String lastName);
//
//	//Query JPQL
//	@Query(value = "FROM Customer WHERE firstName LIKE :cl")
//	List<Customer> selByFirstNameJPQL(@Param("cl") String cl);


}
