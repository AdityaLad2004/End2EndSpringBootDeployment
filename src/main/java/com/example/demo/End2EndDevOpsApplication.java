package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class End2EndDevOpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(End2EndDevOpsApplication.class, args);
	}

	@RestController
	public static class HomeController {

		@GetMapping("/")
		public String homePage() {
			return "<h1 style=\"color: blue;\">Hi, this is Aditya Lad from VIT Pune.</h1>"
					+ "<p style=\"font-size: 18px;\">I'm a <strong>DevOps enthusiast</strong>.</p>";
		}
	}
}
