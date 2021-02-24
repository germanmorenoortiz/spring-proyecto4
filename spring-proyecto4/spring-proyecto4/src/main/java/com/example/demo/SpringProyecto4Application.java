package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Cinema;
import com.example.demo.repository.CinemaRepository;



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
		
		//Cinema cinema1 = new Cinema();
		//cinema1.setName("Nativo");
		//cinema1.setRooms(4);
		//cinema1.setPostalCode(70874);
		//cinema1.setSchedule("H 10-20");
		//cinemaRepository.save(cinema1);
		
		
//		Cinema cinema2 = new Cinema();
//		cinema2.setName("Carrefour");
//		cinema2.setRooms(1);
//		cinema2.setPostalCode(10478);
//		cinema2.setSchedule("H 16-20");
//		cinemaRepository.save(cinema2);
//		
//		Cinema cinema3 = new Cinema();
//		cinema2.setName("Marte");
//		cinema2.setRooms(7);
//		cinema2.setPostalCode(92547);
//		cinema2.setSchedule("H 9-20");
//		cinemaRepository.save(cinema3);
		//List<Movie> movies = Arrays.asList(movie1, movie2);
		//List<User> user =Arrays.asList(user1,user2);
		
	}

}
