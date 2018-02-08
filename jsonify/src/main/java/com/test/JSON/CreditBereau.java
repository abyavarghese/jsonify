package com.test.JSON;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CreditBereau {
	
	private String bereauScore = null;
	private BigDecimal tdscalculated = new BigDecimal( 1000);
	private  List<Rating> ratings = new ArrayList<Rating>( );
	
	public String getBereauScore() {
		return bereauScore;
	}
	public void setBereauScore(String bereauScore) {
		this.bereauScore = bereauScore;
	}
	public BigDecimal getTdscalculated() {
		return tdscalculated;
	}
	public void setTdscalculated(BigDecimal tdscalculated) {
		this.tdscalculated = tdscalculated;
	}
	public List<Rating> getRatings() {
		return ratings;
	}
	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

}
