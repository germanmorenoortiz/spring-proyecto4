package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Cinema;
import com.example.demo.entities.Movie;
import com.example.demo.entities.User;
import com.example.demo.repository.CinemaRepository;
import com.example.demo.repository.UserRepository;



@SpringBootApplication
public class SpringProyecto4Application implements CommandLineRunner{

	
	
	@Autowired
	private CinemaRepository cinemaRepository;
	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringProyecto4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		// Crear datos de prueba.
		
		Cinema cinema1 = new Cinema();
		cinema1.setName("Nativo");
		cinema1.setRooms(4);
		cinema1.setPostalCode(70874);
		cinema1.setSchedule("H 10-20");
		cinemaRepository.save(cinema1);
		
		
		Cinema cinema2 = new Cinema();
		cinema2.setName("Carrefour");
		cinema2.setRooms(1);
		cinema2.setPostalCode(10478);
		cinema2.setSchedule("H 16-20");
		cinemaRepository.save(cinema2);
		
		Cinema cinema3 = new Cinema();
		cinema3.setName("Marte");
		cinema3.setRooms(7);
		cinema3.setPostalCode(92547);
		cinema3.setSchedule("H 9-20");
		cinemaRepository.save(cinema3);
		//List<Movie> movies = Arrays.asList(movie1, movie2);
		//List<User> user =Arrays.asList(user1,user2);
		
		User user1 = new User("german@gmail.com","1234","admin");
		userRepository.save(user1);
		
		User user2 = new User("oscar@gmail.com","1234","normal");
		userRepository.save(user2);
	}

}
