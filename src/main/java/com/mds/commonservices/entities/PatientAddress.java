package com.mds.commonservices.entities;

import javax.persistence.Embeddable;

@Embeddable
public class PatientAddress {

	private String street;
	
	private String city;
	
	private String state;
	
	//private int patient_id;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
/*	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}*/

	@Override
	public String toString() {
		return "PatientAddress [street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	
}
