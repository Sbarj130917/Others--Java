package vacationPack;
import java.util.Date;

public class Flight {
	private String flightNumber;
	private String aircraftType;
	private String originAirport;
	private String destinationAirport;
	private Date departureDate;
	private Date arrivalDate;
	private float flightBaseCost;
	
	
	public Flight() {
		super();
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getAircraftType() {
		return aircraftType;
	}
	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}
	public String getOriginAirport() {
		return originAirport;
	}
	public void setOriginAirport(String originAirport) {
		this.originAirport = originAirport;
	}
	public String getDestinationAirport() {
		return destinationAirport;
	}
	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public float getFlightBaseCost() {
		return flightBaseCost;
	}
	public void setFlightBaseCost(float flightBaseCost) {
		this.flightBaseCost = flightBaseCost;
	}
	public Flight(String flightNumber, String aircraftType, String originAirport, String destinationAirport,
			Date departureDate, Date arrivalDate, float flightBaseCost) {
		super();
		this.flightNumber = flightNumber;
		this.aircraftType = aircraftType;
		this.originAirport = originAirport;
		this.destinationAirport = destinationAirport;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.flightBaseCost = flightBaseCost;
	}
	
	
}
