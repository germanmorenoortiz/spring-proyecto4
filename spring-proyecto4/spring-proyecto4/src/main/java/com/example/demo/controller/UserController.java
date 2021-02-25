package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;


@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/users")
	public String findCinemas(Model model, HttpSession session) {
		model.addAttribute("users", userRepository.findAll());
		
		User userSession = (User) session.getAttribute("user");
		if(userSession != null)
			model.addAttribute("user",userSession);
		
		return "user-list";
	}
	

	
}
