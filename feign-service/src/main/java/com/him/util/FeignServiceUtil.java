package com.him.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//Interface will be marked as feignDemo, 8081 is DemoService URL 
@FeignClient(value="feignDemo",url="http://localhost:8081/user")
public interface FeignServiceUtil {

	@GetMapping("/servicename")
	String getServiceName();

	@GetMapping("/serviceaddress")
	String getServiceAddress();
	
	@GetMapping("/servicedetails")
	String getServiceDetails();
}
