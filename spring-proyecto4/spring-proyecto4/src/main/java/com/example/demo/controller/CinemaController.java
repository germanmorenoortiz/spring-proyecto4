package com.example.demo.controller;

import java.util.Optional;

import javax.servlet.http.HttpSession;

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
	public String findCinemas(Model model, HttpSession session) {
		Cinema cinema1 = (Cinema) session.getAttribute("cinemas");
		if(cinema1 != null)
			model.addAttribute("cinemas", cinema1);
		
		model.addAttribute("cinemas", cinemaRepository.findAll());
		return "cinema-list";
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
	@GetMapping("/cinemas/{id}/edit")
	public String editCinema(@PathVariable Long id, Model model) {
		model.addAttribute("cinemas", cinemaRepository.findById(id).get());
		return "cinema-edit";
	}
	@GetMapping("/cinemas/{id}/delete")
	public String deleteCinemas(@PathVariable Long id) {
		cinemaRepository.deleteById(id);
		return "redirect:/cinemas";
	}
	
	@GetMapping("/cinemas/delete")
	public String deleteCinemas() {
		cinemaRepository.deleteAll();
		return "redirect:/cinemas";
	}
}
