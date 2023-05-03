package com.vocab.trainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TrainerApplication {
	@Bean
	public String sui(){
		return "sui";
	}

	public static void main(String[] args) {
		SpringApplication.run(TrainerApplication.class, args);
	}

}
