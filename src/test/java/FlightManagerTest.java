import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;

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
    private Passenger passenger2;

    @Before
    public void before(){
        flightManager = new FlightManager();

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

        flight = new Flight(pilots, cabinCrewMembers, plane, "FR789", "FRA", "EDI");

        passenger1 = new Passenger("Matt Norris", 2);
        passenger2 = new Passenger("Emily Freeman", 1);

        flight.addPassenger(passenger1, flight);
        flight.addPassenger(passenger2, flight);
    }

    @Test
    public void canCalculateBaggageWeightPerPassenger(){
        assertEquals(1, flightManager.calculateBaggageWeightPerPassenger(flight), 0.00);
    }

    @Test
    public void canCalculateAllowedBaggageWeightPerPassengerOnList(){
        assertEquals(2.5, flightManager.calculateAllowedBaggageWeightPerPassengerOnList(flight), 0.00);
    }

    @Test
    public void canCalculateTotalBaggageWeightBooked(){
        assertEquals(3, flightManager.calculateTotalBaggageWeightBooked(flight));
    }

    @Test
    public void canCalculateRemainingBaggageWeightAvailable(){
        assertEquals(2.0, flightManager.calculateRemainingBaggageWeightAvailable(flight), 0.00);
    }







}
