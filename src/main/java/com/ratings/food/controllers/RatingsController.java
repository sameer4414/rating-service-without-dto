package com.ratings.food.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ratings.food.authority.dto.Authorities;
import com.ratings.food.establishment.dto.Establishments;
import com.ratings.food.service.RatingsService;

@RestController
@RequestMapping(RatingsController.RATING_BASE_URI)
public class RatingsController {
	
	private static final Logger logger = LoggerFactory.getLogger(RatingsController.class);

	public static final String RATING_BASE_URI = "svc/v1/ratings";
	
    @Autowired
    private RatingsService ratingsService;
    
    @RequestMapping("/authorities")
    public Authorities getAuthorities() {
		Authorities authorities = ratingsService.getAuthorities();
		logger.info("Response: {}",authorities);	
		return authorities;
	}
    
    @RequestMapping("/establishments/{localAuthorityId}")
    public Establishments getEstablishments(@PathVariable final int localAuthorityId) {
    	Establishments establishments = ratingsService.getEstablishments(localAuthorityId);
    	return establishments;
    }
}
