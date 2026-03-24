package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;


@RestController
@RequestMapping("/a")

public class serviceAController {

	@Autowired
	private RestTemplate restTemplate;
	
	private static final String BASE_URL="http://localhost:9090/b";
	private static final String SERVICE_A="serviceA";
	int count=1;
	
	
	@GetMapping
	//@CircuitBreaker(name=SERVICE_A,fallbackMethod = "serviceAFallBack")
	//@Retry(name=SERVICE_A)
	@RateLimiter(name=SERVICE_A,fallbackMethod="serviceAFallBack")
	public String serviceA() {
		System.out.println("Retry method Called: "+count++);
		return restTemplate.getForObject(BASE_URL, String.class);
		
	}
	
	
	public String serviceAFallBack(Exception e) {
		return "Ooops..Service B is down Please visit after sometimes...";
	}

}
