import java.util.ArrayList;
import java.util.Random;

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
        Random random = new Random();
        int upperbound = flight.getPlane().getPlaneType().getCapacity();
        seatNumber = random.nextInt(upperbound) +1;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}
