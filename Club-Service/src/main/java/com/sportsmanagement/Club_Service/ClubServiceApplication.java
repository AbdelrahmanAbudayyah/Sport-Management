package com.sportsmanagement.Club_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ClubServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClubServiceApplication.class, args);
	}

}
