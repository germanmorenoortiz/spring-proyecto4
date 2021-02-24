package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Cinema;
import com.example.demo.entities.Movie;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long>{

	List<Cinema> findAllByUsersId(Long id);
	//List<Cinema> findByPostalCode();
	
	
}
