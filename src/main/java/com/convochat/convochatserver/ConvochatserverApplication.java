package com.convochat.convochatserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.convochat" })
public class ConvochatserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConvochatserverApplication.class, args);
	}
}
