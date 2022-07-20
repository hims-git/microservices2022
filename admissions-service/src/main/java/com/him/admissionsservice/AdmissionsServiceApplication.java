package com.him.admissionsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class AdmissionsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdmissionsServiceApplication.class, args);
	}
	
	
	@Bean("restTemplate")
	@LoadBalanced //This tells RestTemplate to go via Load Balancer
	public RestTemplate getRestTemplate() {
		
		return new RestTemplate();
	}
	
	//If you want to route through hard-coded URLs, you need to declare another restTemplate and don't route through LoadBalancer
	
	
	@Bean("restTemplateHardCoded")
	public RestTemplate getRestTemplateHardCoded() {
		
		return new RestTemplate();
	}

}
