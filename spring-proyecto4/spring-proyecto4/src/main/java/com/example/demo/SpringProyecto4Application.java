package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Cinema;
import com.example.demo.entities.Movie;
import com.example.demo.entities.User;
import com.example.demo.repository.CinemaRepository;
import com.example.demo.repository.MovieRepository;
import com.example.demo.repository.UserRepository;



@SpringBootApplication
public class SpringProyecto4Application implements CommandLineRunner{

	
	
	@Autowired
	private CinemaRepository cinemaRepository;
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private MovieRepository movieRepository;
	
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
		
		Movie movie1 = new Movie(); 
		movie1.setTitle("Star Wars");
		movie1.setDuration(120);
		movieRepository.save(movie1);
		
		Movie movie2 = new Movie(); 
		movie2.setTitle("James Bond");
		movie2.setDuration(130);
		movieRepository.save(movie2);
		
		Movie movie3 = new Movie(); 
		movie3.setTitle("Harry Potter");
		movie3.setDuration(130);
		movieRepository.save(movie3);

		
		
	}

}
