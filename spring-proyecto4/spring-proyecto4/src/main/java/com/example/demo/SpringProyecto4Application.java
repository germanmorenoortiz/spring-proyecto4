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
		
		Cinema cinema1 = new Cinema("Nativo", null, null, null, null, null, null);
		//cinema1.setCinema(cinema1);
		cinemaRepository.save(cinema1);
		Cinema cinema2 = new Cinema("Carrefour", null, null, null, null, null, null);
		cinemaRepository.save(cinema2);
		Cinema cinema3 = new Cinema("Lorel", null, null, null, null, null, null);
		cinemaRepository.save(cinema3);
	}

}
