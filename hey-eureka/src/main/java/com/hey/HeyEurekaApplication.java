package com.hey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HeyEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeyEurekaApplication.class, args);
	}
}
