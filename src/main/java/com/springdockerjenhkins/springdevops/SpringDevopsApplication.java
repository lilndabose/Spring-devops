package com.springdockerjenhkins.springdevops;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDevopsApplication {

	Logger logger = LoggerFactory.getLogger(SpringDevopsApplication.class);

	@PostConstruct
	public void testApp(){
		logger.info("App started successfully !!!");
	}

	@PreDestroy
	public void destroyApp(){
		logger.warn("Application is getting destroyed !!!");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDevopsApplication.class, args);
	}
}
