package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entities.Cinema;
import com.example.demo.entities.Movie;

import com.example.demo.entities.User;

import com.example.demo.repository.MovieRepository;


@Controller
public class MovieController {

	@Autowired
	private MovieRepository movieRepository;
	
	@GetMapping("/movies")
	public String findMovies(Model model) {
		
		model.addAttribute("movies", movieRepository.findAll());
		return "movie-list";
	}
	
	@GetMapping("/movies/{id}/view")
	public String verMovies(@PathVariable Long id, Model model) {
		if(id == null) // 1. se comprueba que el id no sea nulo
			return "redirect:/movies";
		
		Optional<Movie> movieOpt = movieRepository.findById(id);
		if (movieOpt.isPresent()) { // 2. se comprueba que existe una movie para ese id
			model.addAttribute("movie", movieOpt.get());
			return "movie-view";
		}
		model.addAttribute("error", "No existe la movie solicitado");
		return "redirect:/movies";
	}
	
	@GetMapping("/movies/{id}/edit")
	public String editarMovie(@PathVariable Long id, Model model) {
		if(id == null) // 1. se comprueba que el id no sea nulo
			return "redirect:/movies";
		
		Optional<Movie> movieOpt = movieRepository.findById(id);
		if (movieOpt.isPresent()) { // 2. se comprueba que existe una movie para ese id
			model.addAttribute("movie", movieOpt.get());
			return "movie-edit";
		}
		model.addAttribute("error", "No existe la movie solicitada");
		return "redirect:/movies";
	}
	
	@GetMapping("/movies/search/{postalCode}")
	public String filterMobiesByPostalCode(Model model) {
//		model.addAttribute("movies", cinemaRepository.findAll());
		return "movie-list";
	}
	@GetMapping("/movies/new")
	public String newMovie(Model model) {
		model.addAttribute("movie", new Movie());
		return "movie-edit";
		
	}
	
	@GetMapping("/movie/{id}/delete")
	public String deleteMovie(@PathVariable Long id) {
		movieRepository.deleteById(id);
		return "redirect:/movies";
	}
	
	// CREAR MÉTODO @POST
	@PostMapping("/movies")
	public String editMovie(@ModelAttribute Movie movie, Model model) {
		movieRepository.save(movie);
		return "redirect:/movies";
	}
}
