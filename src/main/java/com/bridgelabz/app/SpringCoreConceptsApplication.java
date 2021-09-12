package com.bridgelabz.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringCoreConceptsApplication {
	
//	UC2 adding logger for project
	private static final Logger logger= LoggerFactory.getLogger(SpringCoreConceptsApplication.class);

	public static void main(String[] args) {
//	UC1 case
		SpringApplication.run(SpringCoreConceptsApplication.class, args);
		System.out.println("Hello from SpringCoreConcepts");
		
//		adding logger message
		logger.info("spring core concepts from logger");

	}

}
