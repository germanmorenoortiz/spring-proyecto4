package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	@GetMapping("/cinemas/search/{postalCode}")
	public String filterCinemasByPostalCode(Model model) {
//		model.addAttribute("cinemas", cinemaRepository.findAll());
		return "cinema-list";
	}
	
	
}
