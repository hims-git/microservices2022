package com.him.propertyaccessservice.resources;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.him.propertyaccessservice.bean.PropertyAccessBean;
import com.him.propertyaccessservice.bean.PropertyAccessValue;

@RestController
@RequestMapping("/access")
public class PropertyFileAccessControllerResource {

	public PropertyFileAccessControllerResource() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	PropertyAccessBean propertyAccessBean;
	
	@GetMapping("accessPropertyfile")
	public PropertyAccessValue accessPropertyFile() {
		refreshActuator();
		return new PropertyAccessValue(propertyAccessBean.getName(), propertyAccessBean.getDescription());
		
	}
	
	
	public void refreshActuator() {
		
		RestTemplate restTemplate = new RestTemplate();
		
		final String baseURL = "http://localhost:8010/actuator/refresh";
		
		HttpHeaders headers = new HttpHeaders();
		
		headers.set("Content-Type","application/json");
		
		HttpEntity httpEntity = new HttpEntity(headers);
		
		ResponseEntity<String> results = restTemplate.postForEntity(baseURL, httpEntity, String.class);
	}
}
