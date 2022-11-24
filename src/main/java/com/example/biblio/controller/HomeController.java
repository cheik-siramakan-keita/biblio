package com.example.biblio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@GetMapping(value="/accueil")
	public String home1() {
		System.out.println("Hello world! n°1");
		return "home/home1";
	}
	
	@GetMapping(value="/login")
	public String home2() {
		System.out.println("Hello world! n°2");
		return "home/home2.html";
	}
	
	@GetMapping(value="/hello3")
	public String home3(@RequestParam(name="name", required=false, defaultValue="Cheik") String name, Model model) {
		System.out.println("Hello world! n°3");
		model.addAttribute("name", name);
		return "home/home3.html";
	}
	
	@GetMapping(value="/hello4")
	public String home4(@RequestParam(name="name", required=false) String name, Model model) {
		System.out.println("Hello world! n°4");
		model.addAttribute("name", name);
		return "home/home3";
	}
}
