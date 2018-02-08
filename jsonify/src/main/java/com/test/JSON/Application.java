package com.test.JSON;

import java.util.ArrayList;
import java.util.List;

public class Application {
	
	String applicationName = null;
	ApplicationSummary appSummary = null;
	public ApplicationSummary getAppSummary() {
		return appSummary;
	}
	public void setAppSummary(ApplicationSummary appSummary) {
		this.appSummary = appSummary;
	}
	String id = null;
	List<CustomerProfile>customerProfiles = new ArrayList<CustomerProfile>( );
	
	public String getApplicationName() {
		return applicationName;
	}
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<CustomerProfile> getCustomerProfiles() {
		return customerProfiles;
	}
	public void setCustomerProfiles(List<CustomerProfile> summaries) {
		this.customerProfiles = summaries;
	}
	public List<CreditBereau> getCreditBeraus() {
		return creditBeraus;
	}
	public void setCreditBeraus(List<CreditBereau> creditBeraus) {
		this.creditBeraus = creditBeraus;
	}
	List<CreditBereau>creditBeraus = new ArrayList<CreditBereau>( );
	
	

}
