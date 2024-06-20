package ru.star.startask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "ru.star.startask")
public class StartaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartaskApplication.class, args);
	}

}
