package com.capgemini.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	
    // starta o tomcat(servidor)
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
