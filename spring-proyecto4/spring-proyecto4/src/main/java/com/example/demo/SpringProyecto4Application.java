package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.demo.entities.User;
import com.example.demo.repository.CinemaRepository;
import com.example.demo.repository.UserRepository;


@SpringBootApplication
public class SpringProyecto4Application implements CommandLineRunner{

	
	
	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringProyecto4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		// Crear datos de prueba.
		
		User user1 = new User("german@gmail.com","1234","admin");
		userRepository.save(user1);
		
		User user2 = new User("oscar@gmail.com","1234","normal");
		userRepository.save(user2);
	}

}
