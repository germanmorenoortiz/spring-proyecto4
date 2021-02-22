package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Cinema;
import com.example.demo.entities.User;
import com.example.demo.repository.CinemaRepository;
import com.example.demo.repository.UserRepository;


@SpringBootApplication
public class SpringProyecto4Application implements CommandLineRunner{

	
	
	@Autowired
	private CinemaRepository cinemaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringProyecto4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		// Crear datos de prueba.
		
		Cinema cinema1 = new Cinema("Nativo", "Avda.Grande 4","enero", 4, 09005);
		//cinema1.setcinema1(cinema);
		cinemaRepository.save(cinema1);

	}

}
