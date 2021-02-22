package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Cinema;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long>{

	
	//List<Cinema> findByPostalCode();
	
	
}
