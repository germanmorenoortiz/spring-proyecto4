package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;

@Controller
public class registerController {

	@Autowired
	private UserRepository userRepository;
	
	/**
	 * Método para cargar la vista login
	 * @param model
	 * @return
	 */
	@GetMapping("/register")
	public String getRegister(Model model) {
		model.addAttribute(new User());
		return "register";
	}
	
	@PostMapping("/register")
	public String save(@ModelAttribute("user") User user) {				
		userRepository.save(user);
		return "redirect:/login";
	}
	
}
