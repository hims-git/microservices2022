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

	@Autowired
	RestTemplate restTemplateHardCoded;
	
	public AdmissionResource() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/physicians")
	public EmployeeList getPhysicians() {
		
		
		//This causes the hard coding of URL inside aggregating micro services
		//EmployeeList physicians = restTemplate.getForObject("http://localhost:8082/hr/employees", EmployeeList.class);

		
		/*
		 * Now the routing will happen through Eureka service declaration, this needs @LoadBalanced Annotation on RestTemplate, 
		 * otherwise restTemplate will try to find a domain named HR-SERVICE and fail
		 */
		
		EmployeeList physicians = restTemplate.getForObject("http://HR-SERVICE/hr/employees", EmployeeList.class);
		
		
		return physicians;
	}
	
	
	@RequestMapping("/healthissues")
	public DisesaseList getDiseases() {
		
		DisesaseList issues = restTemplate.getForObject("http://PATHOLOGY-SERVICE/pathology/diseases", DisesaseList.class);
		
		return issues;
	}

	@RequestMapping("/physiciansH")
	public EmployeeList getPhysiciansH() {
		
		
		/*
		 * Using a non @LoadBalanced restTemplate will try to use the domain based URLs 
		 */
		EmployeeList physicians = restTemplateHardCoded.getForObject("http://localhost:8082/hr/employees", EmployeeList.class);
		
		
		return physicians;
	}
	
	
	@RequestMapping("/healthissuesH")
	public DisesaseList getDiseasesH() {
		
		DisesaseList issues = restTemplateHardCoded.getForObject("http://localhost:8083/pathology/diseases", DisesaseList.class);
		
		return issues;
	}

}
