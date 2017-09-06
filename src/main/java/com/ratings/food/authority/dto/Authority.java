package com.ratings.food.authority.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Authority {
	
	@JsonProperty("LocalAuthorityId")
	private String localAuthorityId;
	
	@JsonProperty("Name")
	private String name;
	
	@JsonProperty("EstablishmentCount")
	private int establishmentCount;

	public String getLocalAuthorityId() {
		return localAuthorityId;
	}

	public void setLocalAuthorityId(String localAuthorityId) {
		this.localAuthorityId = localAuthorityId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEstablishmentCount() {
		return establishmentCount;
	}

	public void setEstablishmentCount(int establishmentCount) {
		this.establishmentCount = establishmentCount;
	}

	@Override
	public String toString() {
		return "Authority [localAuthorityId=" + localAuthorityId + ", name=" + name + ", establishmentCount="
				+ establishmentCount + "]";
	}
	
}
