package com.sip.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AmsApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(AmsApplication.class, args);
		System.out.println("Hello Spring Boot");
		System.out.println("Couche MVC");
		System.out.println("Couche Data");
		System.out.println("Couche Security");
		System.out.println("Couche Rest");
		System.out.println("Couche Cloud & Microservices");
	}

}
