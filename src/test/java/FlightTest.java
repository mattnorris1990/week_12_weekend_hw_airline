import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;

    private ArrayList<Pilot> pilots;
    private Pilot pilot1;
    private Pilot pilot2;

    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private CabinCrewMember ccMember1;
    private CabinCrewMember ccMember2;
    private CabinCrewMember ccMember3;

    private Plane plane;

    private Passenger passenger1;

    @Before
    public void before () {

        pilot1 = new Pilot("Jimmy Jimbles", Rank.CAPTAIN, "JD456");
        pilot2 = new Pilot("Jenny Jubbles", Rank.FIRSTOFFICER, "JD456");
        ArrayList<Pilot> pilots = new ArrayList<>();
        pilots.add(pilot1);
        pilots.add(pilot2);

        ccMember1 = new CabinCrewMember("Timmy Tooth", Rank.FLIGHTATTENDANT);
        ccMember2 = new CabinCrewMember("Benny Buns", Rank.FLIGHTATTENDANT);
        ccMember3 = new CabinCrewMember("Sammy Snores", Rank.FLIGHTATTENDANT);
        ArrayList<CabinCrewMember> cabinCrewMembers = new ArrayList<>();
        cabinCrewMembers.add(ccMember1);
        cabinCrewMembers.add(ccMember2);
        cabinCrewMembers.add(ccMember3);

        plane = new Plane(PlaneType.EMBRAER175);

        flight = new Flight(pilots, cabinCrewMembers, plane, "FR789", "FRA", "EDI", "06:30");

        passenger1 = new Passenger("Matt Norris", 2);
    }

    @Test
    public void hasPilots(){
        assertEquals(2, flight.getNumberOfPilots());
    }

    @Test
    public void hasCabinCrew(){
        assertEquals(3, flight.getNumberofCabinCrewMembers());
    }

    @Test
    public void hasEmptyPassengerList(){
        assertEquals(0, flight.getNumberofPassengers());
    }

    @Test
    public void hasPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("FR789", flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("FRA", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("06:30", flight.getDepartureTime());
    }

    @Test
    public void canReturnRemainingSeats(){
        assertEquals(5, flight.getRemainingCapacity());
    }

    @Test
    public void canAddPassengerToFlight(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.getNumberofPassengers());
    }

    @Test
    public void cannotAddPassengersIfFlightIsFull(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger1);
        assertEquals(5, flight.getNumberofPassengers());
    }

}
