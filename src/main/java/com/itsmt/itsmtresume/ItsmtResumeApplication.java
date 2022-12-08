package com.itsmt.itsmtresume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ItsmtResumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItsmtResumeApplication.class, args);
	}
}
