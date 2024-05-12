package com.example.discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryserviceapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryserviceapplicationApplication.class, args);
	}

}
