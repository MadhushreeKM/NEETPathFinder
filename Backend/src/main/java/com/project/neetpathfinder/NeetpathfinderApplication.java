package com.project.neetpathfinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class NeetpathfinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeetpathfinderApplication.class, args);
	}

}
