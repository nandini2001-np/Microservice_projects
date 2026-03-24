package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient

public class MsEmployeeServcieApplication {
	
//    @Bean
//	public RestTemplate resttemplate() {
//		return new RestTemplate();
//	}
	
	
//   @Bean
//   public WebClient webClient() {
//	return WebClient.create();
//	   
//   }

	
	public static void main(String[] args) {
		SpringApplication.run(MsEmployeeServcieApplication.class, args);
	}

}
