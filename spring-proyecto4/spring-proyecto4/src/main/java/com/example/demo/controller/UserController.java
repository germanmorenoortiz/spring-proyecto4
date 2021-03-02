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
	
	@GetMapping("/users/{id}/view")
	public String verUser(@PathVariable Long id, Model model) {
		if(id == null) // 1. se comprueba que el id no sea nulo
			return "redirect:/users";
		
		Optional<User> userOpt = userRepository.findById(id);
		if (userOpt.isPresent()) { // 2. se comprueba que existe un cinema para ese id
			model.addAttribute("user", userOpt.get());
			return "user-view";
		}
		model.addAttribute("error", "No existe el usuario solicitado");
		return "redirect:/users";
	}

	@GetMapping("/users/{id}/edit")
	public String editarUser(@PathVariable Long id, Model model) {
		if(id == null) // 1. se comprueba que el id no sea nulo
			return "redirect:/users";
		
		Optional<User> userOpt = userRepository.findById(id);
		if (userOpt.isPresent()) { // 2. se comprueba que existe un  usuario para ese id
			model.addAttribute("user", userOpt.get());
			return "user-edit";
		}
		model.addAttribute("error", "No existe el usuario solicitado");
		return "redirect:/users";
	}
	
	@GetMapping("/users/new")
	public String newUser(Model model) {
		model.addAttribute("user", new User());
		return "user-edit";
		
	}
	
	@GetMapping("/users/{id}/delete")
	public String deleteUser(@PathVariable Long id) {
		userRepository.deleteById(id);
		return "redirect:/users";
	}
	
	// CREAR MÉTODO @POST
	@PostMapping("/users")
	public String editUser(@ModelAttribute User user, Model model) {
		userRepository.save(user);
		return "redirect:/users";
	}
}
