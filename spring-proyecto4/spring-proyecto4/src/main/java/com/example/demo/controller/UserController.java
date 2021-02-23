package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.repository.UserRepository;


@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/users")
	public String findCinemas(Model model) {
		model.addAttribute("user", userRepository.findAll());
		return "user-list";
	}
	

	
}
