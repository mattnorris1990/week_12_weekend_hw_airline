import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Penny Pilotte", Rank.CAPTAIN, "JD432");
    }

    @Test
    public void hasName(){
        assertEquals("Penny Pilotte", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void hasPilotLicenceNumber(){
        assertEquals("JD432", pilot.getPilotLicenceNumber());
    }

    @Test
    public void planeIsFlying(){
        assertEquals("We are in the air", pilot.flyPlane());
    }

}
