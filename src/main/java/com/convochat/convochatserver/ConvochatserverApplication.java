package com.convochat.convochatserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = { "com.convochat" })
@EnableJpaRepositories(basePackages = { "com.convochat.repository" })
@EntityScan(basePackages = { "com.convochat.model" })
public class ConvochatserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConvochatserverApplication.class, args);
	}

}
