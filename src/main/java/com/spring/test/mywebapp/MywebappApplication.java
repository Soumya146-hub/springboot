package com.spring.test.mywebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController()
public class MywebappApplication {
	
	@GetMapping("/")
	public String welcome () {
		return "WELCOME ALL" ;
		
	}

	public static void main(String[] args) {
		SpringApplication.run(MywebappApplication.class, args);
	}

}
