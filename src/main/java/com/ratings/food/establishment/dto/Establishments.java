package com.ratings.food.establishment.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Establishments {
	
	@JsonProperty("establishments")
	private List<Establishment> establishments;

	public List<Establishment> getEstablishments() {
		return establishments;
	}

	public void setEstablishments(List<Establishment> establishments) {
		this.establishments = establishments;
	}

	@Override
	public String toString() {
		return "Establishments [establishments=" + establishments + "]";
	}
	
}
