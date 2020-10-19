package br.com.dbserver.almoco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.dbserver.almoco.model.Restaurant;
import br.com.dbserver.almoco.repository.RestaurantRepository;

@Controller
public class HomeController {
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	@GetMapping("/")
	public String home(Model model) {
		List<Restaurant> restaurants = restaurantRepository.findAll();
		model.addAttribute("restaurants", restaurants);
		return "home";
	}
}
