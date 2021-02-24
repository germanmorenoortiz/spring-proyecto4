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
	
	@GetMapping("/cinema")
	public String findCinema(Model model, HttpSession session) {
		Cinema cinema1 = (Cinema) session.getAttribute("cinemas");
		if(cinema1 != null)
			model.addAttribute("cinema", cinema1);
		
		model.addAttribute("cinema", cinemaRepository.findAll());
		return "cinema-list";
	}
	
	
	@GetMapping("/cinema/search/{postalCode}")
	public String filterCinemaByPostalCode(Model model) {
//		model.addAttribute("cinemas", cinemaRepository.findAll());
		return "cinema-list";
	}
	@GetMapping("/cinema/new")
	public String newCinema(Model model) {
		model.addAttribute("cinema", new Cinema());
		return "cinema-edit";
		
	}
	@GetMapping("/cinema/{id}/edit")
	public String editCinema(@PathVariable Long id, Model model) {
		model.addAttribute("cinema", cinemaRepository.findById(id).get());
		return "cinema-edit";
	}
	@GetMapping("/cinema/{id}/delete")
	public String deleteCinema(@PathVariable Long id) {
		cinemaRepository.deleteById(id);
		return "redirect:/cinema";
	}
	
	@GetMapping("/cinema/delete")
	public String deleteCinema() {
		cinemaRepository.deleteAll();
		return "redirect:/cinema";
	}
}
