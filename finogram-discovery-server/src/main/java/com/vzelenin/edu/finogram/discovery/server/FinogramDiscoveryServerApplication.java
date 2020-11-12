package com.vzelenin.edu.finogram.discovery.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FinogramDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinogramDiscoveryServerApplication.class, args);
	}

}
