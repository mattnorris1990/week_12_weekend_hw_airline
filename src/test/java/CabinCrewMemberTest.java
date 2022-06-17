import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    private CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Timmy Tingles", Rank.FLIGHTATTENDANT);
    }

    @Test
    public void hasName(){
        assertEquals("Timmy Tingles", cabinCrewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.FLIGHTATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void canRelayMessage(){
        assertEquals("Please prepare for takeoff", cabinCrewMember.relayMessageToPassengers("Please prepare for takeoff"));
    }

}
