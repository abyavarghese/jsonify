package com.test.JSON;

import java.math.BigDecimal;

public class ApplicationSummary {
	
	private BigDecimal totalTDS = null;
	private BigDecimal totalIncome = null;
	private int noOfApplicants = 3;
	
	public BigDecimal getTotalTDS() {
		return totalTDS;
	}
	public void setTotalTDS(BigDecimal totalTDS) {
		this.totalTDS = totalTDS;
	}
	public BigDecimal getTotalIncome() {
		return totalIncome;
	}
	public void setTotalIncome(BigDecimal totalIncome) {
		this.totalIncome = totalIncome;
	}
	public int getNoOfApplicants() {
		return noOfApplicants;
	}
	public void setNoOfApplicants(int noOfApplicants) {
		this.noOfApplicants = noOfApplicants;
	}

}
