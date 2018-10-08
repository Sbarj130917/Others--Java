package vacationPack;
import java.util.Date;
import java.util.List;

public class FlightReservation implements IReservation{
	private Flight flightTypeTo;
	private Flight flightTypeFro;
	private int noOfAdults;
	private int noOfChildren;
	
	public Flight getFlightTypeTo() {
		return flightTypeTo;
	}

	public Flight getFlightTypeFro() {
		return flightTypeFro;
	}

	public int getNoOfAdults() {
		return noOfAdults;
	}

	public int getNoOfChildren() {
		return noOfChildren;
	}

	
	public FlightReservation() {
		super();
	}

	public FlightReservation(Flight flightTypeTo, Flight flightTypeFro, int noOfAdults, int noOfChildren) {
		super();
		this.flightTypeTo = flightTypeTo;
		this.flightTypeFro = flightTypeFro;
		this.noOfAdults = noOfAdults;
		this.noOfChildren = noOfChildren;
	}
	
	public double getTotalCost() throws InvalidDataException{
	        double cost;
	        double totalCost;
	        double tax;
	         if(isCityValid(flightTypeTo.getOriginAirport(), flightTypeTo.getDestinationAirport()) && 
	                isToDateValid(flightTypeTo.getDepartureDate()) &&  isFroDateValid(flightTypeFro.getDepartureDate(),flightTypeTo.getArrivalDate()) &&
	                checkAdultNo(noOfAdults,noOfChildren) && isRoundTrip(flightTypeTo.getOriginAirport(), flightTypeFro.getDestinationAirport())){
	            cost= cost(flightTypeTo,noOfAdults,noOfChildren) + cost(flightTypeFro,noOfAdults,noOfChildren);
	            tax= (0.15)*cost;
	            totalCost=cost+tax;
	            return totalCost;
	        }
	        else 
	        {
	            throw new InvalidDataException("Invalid data Exception");
	        }
	        
	    }
	@Override
	public boolean isCityValid(String origin,String destination) {
		if (origin != null && destination != null && !origin.equals(destination))
		return true;
		else
		return false;
	}
	private boolean isToDateValid(Date departureDate) {
		Date currentdate = new Date();
		if (departureDate != null && departureDate.compareTo(currentdate)>0)
		return true;
		else
		return false;
	}
	private boolean isFroDateValid(Date departureDate, Date arrivalDate) {
		if (departureDate != null && departureDate.compareTo(arrivalDate)>0)
		return true;
		else
		return false;
	}
	private boolean checkAdultNo(int noOfAdults, int noOfChildren) {	
		if (noOfAdults >= 1)
		return true;
		else
		return false;
}
	private float cost(Flight flight, int noOfAdults, int noOfChildren) {
		float cost = (noOfAdults + noOfChildren) * (flight.getFlightBaseCost());
		return cost;
	}
	
	private boolean isRoundTrip(String originAirport1, String originAirport2) {
		if(originAirport1.equals(originAirport2) )
			return true;
		else 
			return false;
	}

}



