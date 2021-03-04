package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Cinema;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long>{

    @Query("SELECT t FROM Cinema t WHERE postal_code = :postalCode ")
	List<Cinema> findAllByPostalCode(@Param("postalCode") String postalCode);
	
	
}
