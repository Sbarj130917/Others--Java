package test_flightReservation;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import vacationPack.Flight;

public class FlightTest {

	private String flightNumber, aircraftType;
	private String originAirport, destinationAirport;
	private Date departureDate, arrivalDate;
	private float flightBaseCost;
	
	@Test
	public void testConstructor() {
		{
			String Pattern = "MM/dd/yyyy";
			SimpleDateFormat format = new SimpleDateFormat(Pattern);		
			Date toDeptDate = null;
			Date toArrivDate = null;
			Date froDeptDate = null;
			Date froArrivDate = null;
			try {
				toDeptDate = format.parse("05/12/2018");
				toArrivDate= format.parse("05/12/2018");
				froDeptDate = format.parse("08/01/2018");
				froArrivDate= format.parse("08/01/2018");
			} catch (Exception e) {
				e.printStackTrace();
			}
		Flight flight1= new Flight("AE456","United","Madison","Charlotte",toDeptDate,toArrivDate,(float)500.00);
		assertEquals("AE456", flight1.getFlightNumber() );
		assertEquals("United", flight1.getAircraftType() );
		assertEquals("Madison", flight1.getOriginAirport());
		assertEquals("Charlotte", flight1.getDestinationAirport());
		assertEquals(toDeptDate, flight1.getDepartureDate());
		assertEquals(toArrivDate, flight1.getArrivalDate());
		assertEquals((float)500.00, flight1.getFlightBaseCost(),0.0);
		
		assertFalse("AE".equals(flight1.getFlightNumber()));
		assertFalse("Dummy".equals(flight1.getAircraftType()) );
		assertFalse("NY".equals(flight1.getOriginAirport()));
		assertFalse("Texas".equals(flight1.getDestinationAirport()));
		assertFalse("05/13/2016".equals(flight1.getDepartureDate()));
		assertFalse("08/01/2016".equals(flight1.getArrivalDate()));
		assertFalse(100==(flight1.getFlightBaseCost()));
		}
		
	}
	
	
	void testGettersSetters() {
		String Pattern = "MM/dd/yyyy";
		Date origin = null, destination = null;
		SimpleDateFormat format = new SimpleDateFormat(Pattern);		
		try {
			origin = format.parse("05/12/2018");
			destination= format.parse("15/12/2018");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Flight flight1= new Flight();
		flight1.setFlightNumber("AE123");
		flight1.setAircraftType("Southeast");
		flight1.setOriginAirport("Texas");
		flight1.setDestinationAirport("New York");
		flight1.setDepartureDate(origin);
		flight1.setArrivalDate(destination);
		flight1.setFlightBaseCost((float)300.00);
		
		assertEquals("AE123", flight1.getFlightNumber() );
		assertEquals("Southeast", flight1.getAircraftType() );
		assertEquals("Texas", flight1.getOriginAirport());
		assertEquals("New York", flight1.getDestinationAirport());
		assertEquals("05/13/2016", flight1.getDepartureDate());
		assertEquals("08/01/2016", flight1.getArrivalDate());
		assertEquals((float)300.00, flight1.getFlightBaseCost());
		
		assertFalse("AE".equals(flight1.getFlightNumber()));
		assertFalse("Dummy".equals(flight1.getAircraftType()));
		assertFalse("NY".equals(flight1.getOriginAirport()));
		assertFalse("Texas".equals(flight1.getDestinationAirport()));
		assertFalse("05/13/2015".equals(flight1.getDepartureDate()));
		assertFalse("08/01/2015".equals(flight1.getArrivalDate()));
		assertFalse(100.00 == (flight1.getFlightBaseCost()));
	}

}
