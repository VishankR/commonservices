package com.mds.commonservices.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//JPA Annotation
@Embeddable
public class Contact {
	
	private String home_contact;
	
	private String office_contact;

	@Column(nullable = false)
	private String mobile_contact;

	public String getHome_contact() {
		return home_contact;
	}

	public void setHome_contact(String home_contact) {
		this.home_contact = home_contact;
	}

	public String getOffice_contact() {
		return office_contact;
	}

	public void setOffice_contact(String office_contact) {
		this.office_contact = office_contact;
	}

	public String getMobile_contact() {
		return mobile_contact;
	}

	public void setMobile_contact(String mobile_contact) {
		this.mobile_contact = mobile_contact;
	}
	
}
