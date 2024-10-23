package com.example.marksSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CollegeMarksSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollegeMarksSystemApplication.class, args);
	}

}
