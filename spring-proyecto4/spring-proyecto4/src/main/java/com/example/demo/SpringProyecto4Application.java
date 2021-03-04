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
		
		Cinema Nativo = new Cinema();
		Nativo.setName("Nativo");
		Nativo.setRooms(4);
		Nativo.setPostalCode("70874");
		Nativo.setSchedule("H 10-20");
		cinemaRepository.save(Nativo);
		
		
		Cinema Carrefour = new Cinema();
		Carrefour.setName("Carrefour");
		Carrefour.setRooms(1);
		Carrefour.setPostalCode("10478");
		Carrefour.setSchedule("H 16-20");
		cinemaRepository.save(Carrefour);
		
		Cinema Marte = new Cinema();
		Marte.setName("Marte");
		Marte.setRooms(7);
		Marte.setPostalCode("92547");
		Marte.setSchedule("H 9-20");
		cinemaRepository.save(Marte);
		
		Movie StarWars = new Movie(); 
		StarWars.setTitle("Star Wars");
		StarWars.setDuration(120);
		movieRepository.save(StarWars);
		
		Movie JamesBond = new Movie(); 
		JamesBond.setTitle("James Bond");
		JamesBond.setDuration(130);
		movieRepository.save(JamesBond);
		
		Movie HarryPotter = new Movie(); 
		HarryPotter.setTitle("Harry Potter");
		HarryPotter.setDuration(130);
		movieRepository.save(HarryPotter);

		
		
	}

}
