package com.example.azuredemowar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzuredemowarApplication {

	@GetMapping("/message")
	public String message() {
		return "You have deployed war of spring boot app.";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzuredemowarApplication.class, args);
	}

}
