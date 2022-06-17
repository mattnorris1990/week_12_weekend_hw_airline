import java.util.ArrayList;

public class FlightManager {

// wasn't sure if 'calculate how much baggage weight should be reserved for each passenger for a flight' meant for the total cap, or the actual number of passengers; this is for total cap:
    public double calculateBaggageWeightPerPassenger(Flight flight) {

        int totalWeightAvailable = flight.getPlane().getPlaneType().getTotalWeight() / 2;
        int capacity = flight.getPlane().getPlaneType().getCapacity();

        return (double)totalWeightAvailable / (double)capacity;
    }
//    and this one is to calculate relative to the number of booked passengers
public double calculateAllowedBaggageWeightPerPassengerOnList(Flight flight) {

        int totalWeightAvailable = flight.getPlane().getPlaneType().getTotalWeight() / 2;
    int passengers = flight.getNumberofPassengers();

    return (double) totalWeightAvailable / (double) passengers;
}

    public int calculateTotalBaggageWeightBooked(Flight flight) {
        int totalWeight = 0;

        ArrayList<Passenger> passengers = flight.getPassengers();

        for (Passenger passenger : passengers ){
            totalWeight += passenger.getNumberOfBags();
        }

        return totalWeight;
    }

    public double calculateRemainingBaggageWeightAvailable(Flight flight) {

        double spaceAvailable = flight.getPlane().getPlaneType().getTotalWeight() / 2;
        double totalBookedWeight = calculateTotalBaggageWeightBooked(flight);

        return spaceAvailable - totalBookedWeight;
    }
}
