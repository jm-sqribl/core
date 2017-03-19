package com.freeform.core.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Company extends AbstractParty {
	
	private String companyName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}
