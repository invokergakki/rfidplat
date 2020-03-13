package com.iking.provider;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;
@MapperScan("com.iking.provider.dao.mapper")
@SpringBootApplication
public class Run extends SpringBootServletInitializer {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Run.class, args);
		
	}
}