package com.example.homifytest2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Homifytest2Application {

	public static void main(String[] args) {
		SpringApplication.run(Homifytest2Application.class, args);
	}
}
