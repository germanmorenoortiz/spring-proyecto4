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
import com.example.demo.repository.CinemaRepository;


@Controller
public class CinemaController {

	@Autowired
	private CinemaRepository cinemaRepository;
	
	@GetMapping("/cinemas")
	public String findCinemas(Model model) {
		
		model.addAttribute("cinemas", cinemaRepository.findAll());
		return "cinema-list";
	}
	
	@GetMapping("/cinemas/{id}/view")
	public String verCinema(@PathVariable Long id, Model model) {
		if(id == null) // 1. se comprueba que el id no sea nulo
			return "redirect:/cinemas";
		
		Optional<Cinema> cinemaOpt = cinemaRepository.findById(id);
		if (cinemaOpt.isPresent()) { // 2. se comprueba que existe un cinema para ese id
			model.addAttribute("cinema", cinemaOpt.get());
			return "cinema-view";
		}
		model.addAttribute("error", "No existe el cinema solicitado");
		return "redirect:/cinemas";
	}
	
	@GetMapping("/cinemas/{id}/edit")
	public String editarCinema(@PathVariable Long id, Model model) {
		if(id == null) // 1. se comprueba que el id no sea nulo
			return "redirect:/cinema";
		
		Optional<Cinema> cinemaOpt = cinemaRepository.findById(id);
		if (cinemaOpt.isPresent()) { // 2. se comprueba que existe un producto para ese id
			model.addAttribute("cinema", cinemaOpt.get());
			return "cinema-edit";
		}
		model.addAttribute("error", "No existe el producto solicitado");
		return "redirect:/cinema";
	}
	
	@GetMapping("/cinemas/search/{postalCode}")
	public String filterCinemasByPostalCode(Model model) {
//		model.addAttribute("cinemas", cinemaRepository.findAll());
		return "cinema-list";
	}
	@GetMapping("/cinemas/new")
	public String newCinema(Model model) {
		model.addAttribute("cinema", new Cinema());
		return "cinema-edit";
		
	}
	
	@GetMapping("/cinemas/{id}/delete")
	public String deleteCinema(@PathVariable Long id) {
		cinemaRepository.deleteById(id);
		return "redirect:/cinemas";
	}
	
	// CREAR MÉTODO @POST
	@PostMapping("/cinemas")
	public String editCinema(@ModelAttribute Cinema cinema, Model model) {
		cinemaRepository.save(cinema);
		return "cinema-list";
	}
}
