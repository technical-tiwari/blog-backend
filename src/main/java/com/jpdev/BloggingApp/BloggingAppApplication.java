package com.jpdev.BloggingApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.jpdev.BloggingApp", "com.jpdev.controller", "com.jpdev.services"})
@EntityScan(basePackages = "com.jpdev.entities")
@EnableJpaRepositories(basePackages = "com.jpdev.repo")
public class BloggingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloggingAppApplication.class, args);
	}

}
