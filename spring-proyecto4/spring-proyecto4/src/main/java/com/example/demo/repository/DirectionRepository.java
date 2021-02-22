package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Direction;

@Repository
public interface DirectionRepository extends JpaRepository<Direction, Long>{

}
