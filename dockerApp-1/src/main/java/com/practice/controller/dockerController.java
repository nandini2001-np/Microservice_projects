package com.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dockerController {
	
	@GetMapping("/dck")
	public String dockerapp() {
		return "Anyone can access this docker application...";
	}
	

}
