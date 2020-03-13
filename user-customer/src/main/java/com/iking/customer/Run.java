package com.iking.customer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Run extends SpringBootServletInitializer {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Run.class, args);
		
	}
}