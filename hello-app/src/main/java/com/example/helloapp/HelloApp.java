package com.example.helloapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ZZH
 */
@SpringBootApplication
@EnableDiscoveryClient
public class HelloApp {

	public static void main(String[] args) {
		SpringApplication.run(HelloApp.class, args);
	}

}
