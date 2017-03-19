package com.freeform.core.model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractParty extends AbstactAudit {
	
	protected String address;
	protected String address2;
	protected String city;
	protected String state;
	protected String postCode;
	
	@ManyToOne
	@JoinColumn(name = "parentCompanyId")
	private Company parentCompany;
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
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

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	
	public Company getParentCompany() {
		return parentCompany;
	}
	
	public void setParentCompany(Company parentCompany) {
		this.parentCompany = parentCompany;
	}
}
