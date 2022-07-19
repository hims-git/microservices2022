package com.him.admissionsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class AdmissionsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdmissionsServiceApplication.class, args);
	}
	
	
	@Bean
	public RestTemplate getRestTemplate() {
		
		return new RestTemplate();
	}

}
