package com.him.pathologyservice;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pathology")
public class PathologyResource {

	public PathologyResource() {
		// TODO Auto-generated constructor stub
	}
	
	List<Disease> diseases = Arrays.asList(
			new Disease("d1","Asthma","Warm Water bath"),
			new Disease("d2","Headache","Hot Water Vapour"),
			new Disease("d3","Corona","Wash Hands and stay safe")
			);

	
	@RequestMapping("/diseases")
	public DisesaseList getEmployees() {
		
		DisesaseList diseasesList = new DisesaseList();
		
		diseasesList.setDiseases(diseases);
		
		return diseasesList;
	}
	
	@RequestMapping("/diseases/{id}")
	public Disease getEmployeeById(@PathVariable("id") String id)
	{
		Disease e = diseases.stream()
				.filter(employee -> id.equals(employee.getId()))
				.findAny().orElse(null);
		
		return e;
	}
	
}
