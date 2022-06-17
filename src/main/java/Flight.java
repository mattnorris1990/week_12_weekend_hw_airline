import java.time.LocalTime;
import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private LocalTime departureTime;

    public Flight(ArrayList<Pilot> pilots, ArrayList<CabinCrewMember> cabinCrewMembers, Plane plane, String flightNumber, String destination, String departureAirport) {
        this.pilots = pilots;
        this.cabinCrewMembers = cabinCrewMembers;
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = LocalTime.now();
    }

    public int getNumberOfPilots() {
        return this.pilots.size();
    }

    public int getNumberofCabinCrewMembers() {
        return this.cabinCrewMembers.size();
    }

    public int getNumberofPassengers() {
        return this.passengers.size();
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public int getRemainingCapacity() {
        return plane.getPlaneType().getCapacity();
    }

    public void addPassenger(Passenger passenger) {
        if (passengers.size() < plane.getPlaneType().getCapacity()){
            passengers.add(passenger);
        }
    }

    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }
}
