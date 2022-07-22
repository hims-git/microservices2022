package com.him;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients //Enabling Feign
public class FeignServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignServiceApplication.class, args);
	}

}
