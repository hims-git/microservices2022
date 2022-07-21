package com.him.configservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
 * This is example of using profile based properties file bundled 
 * within same service source code.
 */
@SpringBootApplication
public class ConfigProfilesServiceApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ConfigProfilesServiceApplication.class, args);
	}

	
	@Autowired
	private ServerProperties serverProperties; 
	
	
	/*
	 * This is only to print the used profiles.
	 */
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(serverProperties);
		
	}
	
	

}
