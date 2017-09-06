package com.ratings.food.establishment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Scores {
	
	@JsonProperty("Hygiene")
	private Integer hygiene;

	public Integer getHygiene() {
		return hygiene;
	}

	public void setHygiene(Integer hygiene) {
		this.hygiene = hygiene;
	}

	@Override
	public String toString() {
		return "Scores [hygiene=" + hygiene + "]";
	}
	
}
