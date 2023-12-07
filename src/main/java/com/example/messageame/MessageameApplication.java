package com.example.messageame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.messageame.repository.*")
@ComponentScan(basePackages = { "com.example.messageame.controllers*" })
@EntityScan("com.example.messageame.model.*")
public class MessageameApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageameApplication.class, args);
	}
}
