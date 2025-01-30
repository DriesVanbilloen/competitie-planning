package com.vanbilloen.competitieplanning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
public class CompetitiePlanningApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompetitiePlanningApplication.class, args);
	}

}
