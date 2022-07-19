package com.him.admissionsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/admissions")
public class AdmissionResource {
	
	@Autowired
	RestTemplate restTemplate;

	public AdmissionResource() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/physicians")
	public EmployeeList getPhysicians() {
		
		EmployeeList physicians = restTemplate.getForObject("http://localhost:8082/hr/employees", EmployeeList.class);
		
		return physicians;
	}
	
	
	@RequestMapping("/healthissues")
	public DisesaseList getDiseases() {
		
		DisesaseList issues = restTemplate.getForObject("http://localhost:8083/pathology/diseases", DisesaseList.class);
		
		return issues;
	}


}