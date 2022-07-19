package com.him.firstexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * This will get used as Service Library
 * 
 * @author Administrator
 *
 */
@RestController
public class MyEndPoints {

	@RequestMapping("/mypage")
	public String myString() {
		return "First Microservice Exmaple";
	}

	@RequestMapping("/second")
	public String sayHello(@RequestParam String name) {
		return "Hello/Howdy/KemChhe " + name;
	}
	
	
	@RequestMapping("/secondpathvariable/{name}/{country}")
	public String sayHello2(@PathVariable String name, @PathVariable String country) {
		return "Looks like : " + name +" is from :" + country;
	}
	
	@GetMapping(path="/secondSampleBean")
	public SecondSampleBean secondSampleBean() {
		return new SecondSampleBean("For POJO class");
	}

}
