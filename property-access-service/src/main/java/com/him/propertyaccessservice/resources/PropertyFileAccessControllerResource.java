package com.him.propertyaccessservice.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
		
		return new PropertyAccessValue(propertyAccessBean.getName(), propertyAccessBean.getDescription());
		
	}
	
}
