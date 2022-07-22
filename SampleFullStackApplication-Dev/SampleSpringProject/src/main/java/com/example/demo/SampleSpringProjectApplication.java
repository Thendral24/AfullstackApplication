package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleSpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringProjectApplication.class, args);

		System.out.println("Sample Project Run Started");

		User user = new User();

		System.out.println(user);

	}

}
