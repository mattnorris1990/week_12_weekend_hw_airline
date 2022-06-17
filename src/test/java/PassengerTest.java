import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger ("Matt Norris", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Matt Norris", passenger.getName());
    }

    @Test
    public void hasNumberOfBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }

}
