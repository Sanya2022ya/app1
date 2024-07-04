package com.example.SECURITYAPP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.SECURITYAPP.repository")
@EntityScan("com.example.SECURITYAPP.model")
public class SecurityappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityappApplication.class, args);
	}
}
