package com.him.firstexample;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("citiprops")
public class ExampleProperties {

	public String getGreetings() {
		return greeting;
	}

	public void setGreeting(String greetings) {
		this.greeting = greetings;
	}

	private String greeting = "Thank You :";

	public ExampleProperties() {
		// TODO Auto-generated constructor stub
	}

	public String getGreeting() {
		// TODO Auto-generated method stub
		return greeting;
	}

}
