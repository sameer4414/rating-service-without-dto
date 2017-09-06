package com.ratings.food.establishment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Establishment {
	
	@JsonProperty("FHRSID")
	private String fhrsid;
	
	@JsonProperty("BusinessName")
	private String businessName;
	
	private Scores scores;

	public String getFhrsid() {
		return fhrsid;
	}

	public void setFhrsid(String fhrsid) {
		this.fhrsid = fhrsid;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public Scores getScores() {
		return scores;
	}

	public void setScores(Scores scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Establishment [fhrsid=" + fhrsid + ", businessName=" + businessName + ", scores=" + scores + "]";
	}
	
}
