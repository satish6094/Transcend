package com.cloudproco.model;

import lombok.Data;

@Data
public class PartyMetaData {
	private Long	partyId;
	private String	firstName;
	private String	lastName;
	private String	companyName;
	private String	countryName;
	private String	address1;
	private String	address2;
	private String	address3;
	private String	city;
	private String	state;
	private String	pinCode;
	private String	source;
	
}
