package com.example.demo_docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDockerApplication.class, args);
	}

	@GetMapping
	public String hello() {
		return "Hello World";
	}
	@GetMapping("/say")
	public String say() {
		return "Hello World speaks";
	}

//	@GetMapping("/hello")
//	public String hello2() {
//		return "Hello World speaks from Spring Boot";
//	}
}
