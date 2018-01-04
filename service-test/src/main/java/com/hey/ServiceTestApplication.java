package com.hey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceTestApplication.class, args);
	}
}
