package com.cloudproco.transcend.custom.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor
public class PartyDetailsResponse {
	private String partyId;
	private String firstName;
	private String lastName;
	private String companyName;
	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	private String sourceList;

	
//	public PartyDetailsResponse(String partyId, String firstName, String lastName, String companyName, String addressLine1, String addressLine2, String addressLine3, String city, String state, String postalCode, String country, String sourceList){
//		
//	}
}
