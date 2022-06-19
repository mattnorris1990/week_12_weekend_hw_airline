import java.util.ArrayList;

public class Passenger extends Person {

    private int numberOfBags;
    private Flight flight;
    private int seatNumber;

    public Passenger(String name, int numberOfBags) {
        super(name);
        this.numberOfBags = numberOfBags;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return this.flight;
    }

    public void setSeatNumber(Flight flight) {

        int min = 1;
        int max = flight.getPlane().getPlaneType().getCapacity();
        int newSeat = (int)Math.floor(Math.random()*(max-min+1)+min);

        ArrayList<Integer> filledSeats;
        filledSeats = new ArrayList<>();

        for (Passenger passenger : flight.getPassengers()){
            filledSeats.add(passenger.getSeatNumber());
        }

        while (filledSeats.contains(newSeat)){
            newSeat = (int)Math.floor(Math.random()*(max-min+1)+min);
        }

        seatNumber = newSeat;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}
