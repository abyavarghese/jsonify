package com.test.JSON;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Main {

	
	
	public static void main( String args[]) {
		Application app = new Application( );
		ApplicationSummary summary = new ApplicationSummary( );
		summary.setNoOfApplicants(3);
		summary.setTotalIncome(new BigDecimal(1000000));
		summary.setTotalTDS(new BigDecimal( 1450000));
		app.setAppSummary(summary);
		Rating rating1 = new Rating( );
		Rating rating2 = new Rating( );
		rating1.setRating30("100");
		rating1.setRating60( "200");
		rating1.setRating90( "300");
		rating2.setRating60( "400");
		rating2.setRating60( "500");
		rating2.setRating90( "600");
		List<Rating>ratings = new ArrayList<Rating>( );
		ratings.add(rating1);
		ratings.add( rating2);
		CreditBereau bereau1 = new CreditBereau( );
		bereau1.setBereauScore("1000");
		bereau1.setTdscalculated(new BigDecimal( 100000L));
		Rating rating3 = new Rating( );
		Rating rating4 = new Rating( );
		rating3.setRating30("100A");
		rating3.setRating60( "200A");
		rating3.setRating90( "300A");
		rating4.setRating60( "400A");
		rating4.setRating60( "500A");
		rating4.setRating90( "600A");
		List<Rating>ratings2 = new ArrayList<Rating>( );
		ratings2.add(rating3);
		ratings2.add( rating4);
		CreditBereau bereau2 = new CreditBereau( );
		bereau2.setBereauScore("1000A");
		bereau2.setTdscalculated(new BigDecimal( 100000L));
		bereau2.setRatings(ratings2);
		List<CreditBereau>bereaus = new ArrayList<CreditBereau>();
		bereaus.add(bereau1);
		bereaus.add(bereau2);
		app.setApplicationName("AppName");
		app.setId("12");
		app.setCreditBeraus(bereaus);
		ObjectMapper objectMapper = new ObjectMapper( );
		StringWriter writer = new StringWriter();
		try {
			objectMapper.writeValue(writer, app);
			System.out.println("complete json is ;-"+ writer);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
