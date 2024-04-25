package com.example.IBGE_RestAPI.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication(scanBasePackages = {"com.example"})
@EnableMongoRepositories("com.example.IBGE_RestAPI.repository")
public class ibgeApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(ibgeApiApplication.class, args);
	}

}
