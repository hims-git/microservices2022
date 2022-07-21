package com.him.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.him.model.CatalogItem;
import com.him.model.Movie;
import com.him.model.Rating;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class MovieInfo {

	//Service doesn't require constructor
	
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="getFallbackCatalogItem")
	public CatalogItem getCatalogItem(Rating rating)
	{
		Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId() , Movie.class);
		return new CatalogItem(movie.getName(), movie.getDescription(), rating.getRating());
	}

	//fallback method should have the same signature as main method
	public CatalogItem getFallbackCatalogItem(Rating rating)
	{
		
		return new CatalogItem("Movie name not found", "", rating.getRating());
	}
	
	
	

}
