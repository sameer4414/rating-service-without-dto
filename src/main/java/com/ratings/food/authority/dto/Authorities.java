package com.ratings.food.authority.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Authorities {
	
	@JsonProperty("authorities")
	private List<Authority> authorities;

	public List<Authority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<Authority> authorities) {
		this.authorities = authorities;
	}

	@Override
	public String toString() {
		return "Authorities [authorities=" + authorities + "]";
	}
	
}
