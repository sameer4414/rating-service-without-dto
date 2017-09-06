package com.ratings.food.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.ratings.food.authority.dto.Authorities;
import com.ratings.food.establishment.dto.Establishments;

@Component
public class RatingsService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	private final String establishmentsRatingUrl;
	
	private final String localAuthorityUrl;
	
	@Autowired
	public RatingsService(@Value("${ratings.authority.url}") final String localAuthorityUrl, @Value("${ratings.establishments.url}") final String establishmentsRatingUrl) {
		this.localAuthorityUrl = localAuthorityUrl;
		this.establishmentsRatingUrl = establishmentsRatingUrl;
	}
	public Establishments getEstablishments(final int localAuthorityId) {
		addHeaderValues();
		
		Establishments establishments = restTemplate.getForObject(establishmentsRatingUrl, Establishments.class, localAuthorityId);
		return establishments;
	}

	public Authorities getAuthorities() {
		addHeaderValues();
		
		Authorities authorities = restTemplate.getForObject(localAuthorityUrl, Authorities.class);
		return authorities;
	}
	
	private void addHeaderValues() {
		List<ClientHttpRequestInterceptor> interceptorsList = new ArrayList<>();
		interceptorsList.add(new HeaderRequestInterceptor("x-api-version", "2"));
		interceptorsList.add(new HeaderRequestInterceptor("Access-Control-Allow-Methods", "GET, POST, OPTIONS"));
		interceptorsList.add(new HeaderRequestInterceptor("Access-Control-Allow-Origin", "*"));

		restTemplate.setInterceptors(interceptorsList);
	}
}
