package com.danielrd7.moviesApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Spring Boot application entry point for Movies API.
 *
 * @author Enrique Sanchez
 */
@SpringBootApplication
public class MoviesApiApplication {

	/**
	 * Starts the Spring Boot application.
	 *
	 * @param args command-line arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(MoviesApiApplication.class, args);
	}

}