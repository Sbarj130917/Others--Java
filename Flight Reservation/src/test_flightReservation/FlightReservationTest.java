package test_flightReservation;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import vacationPack.Flight;
import vacationPack.FlightReservation;
import vacationPack.InvalidDataException;
public class FlightReservationTest {
	@Test
	public void testConstructors() throws ParseException {
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
		Flight toFlight = new Flight 
				("AE456","United","Madison","Charlotte",toDeptDate,toArrivDate,(float) 500.00);	
		Flight froFlight = new Flight ("AE777","Delta","Charlotte","Madison",froDeptDate,froArrivDate,(float)300.00);
		FlightReservation flightReservation = new FlightReservation(toFlight,froFlight,2,4);	
		assertEquals("Charlotte", flightReservation.getFlightTypeTo().getDestinationAirport());
		assertEquals("Charlotte", flightReservation.getFlightTypeFro().getOriginAirport());
		assertEquals(2,flightReservation.getNoOfAdults());
		assertEquals(4,flightReservation.getNoOfChildren());		
	}

@Test
public void getTotalCostValidScenarioTest(){
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
	
	Flight toFlight = new Flight 
			("AE456","United","Madison","Charlotte",toDeptDate,toArrivDate,(float) 500.00);	
	Flight froFlight = new Flight ("AE777","Delta","Charlotte","Madison",froDeptDate,froArrivDate,(float)300.00);
	FlightReservation flightReservation = new FlightReservation(toFlight,froFlight,2,4);
	try {
		assertEquals(5520.0,flightReservation.getTotalCost(),0.0);
	
	} catch (InvalidDataException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
@Test
public void isCityValidTest() {
	FlightReservation f=new FlightReservation();
	assertTrue(f.isCityValid("Charlotte","Madison"));
}

@Test
public void isCityInValidTest() {
	FlightReservation f=new FlightReservation();
	assertFalse(f.isCityValid("Charlotte","Charlotte"));
}



@Test
public void getTotalCostInValidScenarioTest(){
	String Pattern = "MM/dd/yyyy";
	SimpleDateFormat format = new SimpleDateFormat(Pattern);		
	Date toDeptDate = null;
	Date toArrivDate = null;
	Date froDeptDate = null;
	Date froArrivDate = null;
	try {
		toDeptDate = format.parse("05/12/2016");
		toArrivDate= format.parse("05/12/2018");
		froDeptDate = format.parse("08/01/2018");
		froArrivDate= format.parse("08/01/2018");
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	Flight toFlight = new Flight 
			("AE456","United","Madison","Charlotte",toDeptDate,toArrivDate,(float) 500.00);	
	Flight froFlight = new Flight ("AE777","Delta","Charlotte","Madison",froDeptDate,froArrivDate,(float)300.00);
	FlightReservation flightReservation = new FlightReservation(toFlight,froFlight,2,4);
	try {
		flightReservation.getTotalCost();
	
	} catch (InvalidDataException e) {
		// TODO Auto-generated catch block
		assertEquals("Invalid data Exception",e.getMessage());
	}
	
}
@Test
public void invalidDepartureArrivalTest(){
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
		froArrivDate= format.parse("08/01/2017");
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	Flight toFlight = new Flight 
			("AE456","United","Madison","Charlotte",toDeptDate,toArrivDate,(float) 500.00);	
	Flight froFlight = new Flight ("AE777","Delta","Charlotte","Madison",froDeptDate,froArrivDate,(float)300.00);
	FlightReservation flightReservation = new FlightReservation(toFlight,froFlight,2,4);
	try {
		flightReservation.getTotalCost();
	
	} catch (InvalidDataException e) {
		// TODO Auto-generated catch block
		assertEquals("Invalid data Exception",e.getMessage());
	}
	
}
@Test
public void invalidRoundTripTest(){
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
		froArrivDate= format.parse("08/01/2017");
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	Flight toFlight = new Flight 
			("AE456","United","Madison","Charlotte",toDeptDate,toArrivDate,(float) 500.00);	
	Flight froFlight = new Flight ("AE777","Delta","Charlotte","New York",froDeptDate,froArrivDate,(float)300.00);
	FlightReservation flightReservation = new FlightReservation(toFlight,froFlight,2,4);
	try {
		flightReservation.getTotalCost();
	
	} catch (InvalidDataException e) {
		// TODO Auto-generated catch block
		assertEquals("Invalid data Exception",e.getMessage());
	}
}
}