package com.week9.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Main class for the Eureka Server application
 * 
 * @EnableEurekaServer - Configures this application as a Eureka Server -
 *                     Enables service registry functionality for microservices
 *                     - Allows other microservices to register and discover
 *                     each other
 * 
 * @SpringBootApplication - Combines @Configuration, @EnableAutoConfiguration,
 *                        and @ComponentScan - Sets up Spring Boot application
 *                        with auto-configuration
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	/**
	 * Main method to start the Spring Boot application
	 * 
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		// Launches the Spring application context
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
