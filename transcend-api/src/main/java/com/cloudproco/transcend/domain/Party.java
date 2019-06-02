package com.cloudproco.transcend.domain;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name="RESTRICTED_PARTY_DTLS")
public class Party {
	@Id
	@Column(name="PARTY_ID")
	private Long partyId;
	
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="COMPANY_NAME")
	private String companyName;
	
	@Column(name="ADDRESS_LINE1")
	private String addressLine1;
	
	@Column(name="ADDRESS_LINE2")
	private String addressLine2;
	
	@Column(name="ADDRESS_LINE3")
	private String addressLine3;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="POSTAL_CODE")
	private String postalCode;
	
	@Column(name="COUNTRY2")
	private String country2;
	
	@Column(name="LIST_SOURCE")
	private String listSource;
	
	@Column(name="CREATED_DATE")
	private Timestamp createdDate;
	
	@Column(name="MODIFIED_DATE")
	private Timestamp modifiedDate;
	
}
