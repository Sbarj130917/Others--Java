package vacationPack;
import java.text.SimpleDateFormat;
import java.util.Date;
public class VacationPackageDemo {
		public static void main(String args[])
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
			
			Flight toFlight = new Flight 
					("AE456","United","Madison","Charlotte",toDeptDate,toArrivDate,(float) 500.00);	
			Flight froFlight = new Flight ("AE777","Delta","Charlotte","Madison",froDeptDate,froArrivDate,(float)300.00);
			FlightReservation flightReservation = new FlightReservation(toFlight,froFlight,2,4);
			try {
				double totalCost = flightReservation.getTotalCost();
				System.out.println("Total cost of return flight is"+totalCost);
			} catch (InvalidDataException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}

	}

