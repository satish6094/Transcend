package com.cloudproco.transcend.custom.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDetailsResponse {

	private Long id;
	private String firstName;
	private String lastName;
	private String title;
	private String address;
	private String birthPlace;
	private Date birthDate;
	

	public PersonDetailsResponse(String fName, String lName, String title, String address, String birthPlace, Date birthDate) {
		super();
		this.setFirstName(fName);
		this.setLastName(lName);
		this.setTitle(title);
		this.setAddress(address);
		this.setBirthPlace(birthPlace);
		this.setBirthDate(birthDate);
	}
	
	public PersonDetailsResponse(Long id, String address, Date birthDate, String birthPlace, String fName, String lName, String title) {
		super();
		this.setId(id);
		this.setFirstName(fName);
		this.setLastName(lName);
		this.setTitle(title);
		this.setAddress(address);
		this.setBirthPlace(birthPlace);
		this.setBirthDate(birthDate);
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getBirthPlace() {
		return birthPlace;
	}


	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
}
