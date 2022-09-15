package com.Reset.PortfolioStarter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestTwoController {
	
	@GetMapping("/salary")
	public String getSalary() {
		RestTemplate template =  new RestTemplate();
		ResponseEntity<String> name = template.getForEntity("http://localhost:8080/name", String.class);
		String name1 = name.getBody();
		return "Salary"+ name1;
	}

}
