package com.Reset.PortfolioStarter.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Reset.PortfolioStarter.Entity.User;
import com.Reset.PortfolioStarter.Service.PortfolioService;

@RestController
@CrossOrigin
public class PortfolioController {

	@Autowired
	private PortfolioService pservice;
	
	@PostMapping("/addUser")
	public User saveUser(@RequestBody User user) {
		return pservice.saveUser(user);
	}
	
	@GetMapping("/getAllUser")
	public List<User> getAllUser() {
		return pservice.getAllUser();
		
	}
	
	@GetMapping("/getUserById")
	public User getUser(@RequestBody User user){
		return pservice.getUserById(user);
		
	}
	
	@DeleteMapping("/deleteUserById")
	public List<User> deleteUser(@RequestBody User user){
		return pservice.deleteUserById(user);
		
	}
	
	@GetMapping("/getGenderOfUser")
	public Map<String, Long> getGenderOfUser(){
		return pservice.getGenderOfUser();
	}
	
	@GetMapping("/getMaleFemaleAgeAverage")
	public Map<String, Double> getMaleFemaleAgeAverage() {
		return pservice.getMaleFemaleAgeAverage();
	}
	
	@GetMapping("/getMaleFemaleSalaryAverage")
	public Map<String, Double> getMaleFemaleSalaryAverage() {
		return pservice.getMaleFemaleSalaryAverage();
	}
}
