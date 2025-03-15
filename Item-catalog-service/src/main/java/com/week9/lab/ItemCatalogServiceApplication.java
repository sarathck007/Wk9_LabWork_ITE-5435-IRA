package com.week9.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Main class for the Item Catalog Service application
 * 
 * @EnableDiscoveryClient - Enables service registration with Eureka Server -
 *                        Allows this service to be discovered by other services
 * 
 * @SpringBootApplication - Combines @Configuration, @EnableAutoConfiguration,
 *                        and @ComponentScan - Sets up Spring Boot application
 *                        with auto-configuration
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ItemCatalogServiceApplication {

	/**
	 * Main method to start the Spring Boot application
	 * 
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		// Launches the Spring application context
		SpringApplication.run(ItemCatalogServiceApplication.class, args);
	}

}
