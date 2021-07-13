package com.practice.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.practice.*")
public class SamlBasedAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamlBasedAuthenticationApplication.class, args);
	}

}
