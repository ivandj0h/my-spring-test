package com.ivandjoh.ivandjohtest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class IvandjohTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(IvandjohTestApplication.class, args);
	}

	/**
	 * This is a test bean that will throw an exception when the application starts.
	 *	@Bean
	 *	CommandLineRunner() {
	 *		return args -> {
	 *		throw new Exception("Something went wrong");
	 *	};
     */

	@Bean
	CommandLineRunner commandLineRunner() {
		return args -> {
			throw new Exception("Something went wrong");
		};
	}

}
