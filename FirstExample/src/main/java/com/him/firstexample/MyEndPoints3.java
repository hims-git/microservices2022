package com.him.firstexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyEndPoints3 {
	
	@Autowired
	ExampleProperties props;
	

	public MyEndPoints3() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/greetothers")
	public String greet(@RequestParam String details)
	{
		return props.getGreeting() + details;
	}
	

}
