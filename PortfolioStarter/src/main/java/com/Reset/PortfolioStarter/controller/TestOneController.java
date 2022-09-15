package com.Reset.PortfolioStarter.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestOneController {
	
	@Value("${name2}")
	private String nameS;
	
	@GetMapping("/name")
	public String getName() {
		System.out.println("My name:"+nameS);
		return "working";
	}

}
