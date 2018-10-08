package vacationPack;
public interface IReservation {
public double getTotalCost() throws InvalidDataException;
public boolean isCityValid(String origin,String destination);
}
