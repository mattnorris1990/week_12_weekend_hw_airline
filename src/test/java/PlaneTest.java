import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.EMBRAER175);
    }

    @Test
    public void hasPlaneType(){
        assertEquals(PlaneType.EMBRAER175, plane.getPlaneType());
    }

    @Test
    public void hasCapacity(){
        assertEquals(5, plane.getPlaneType().getCapacity());
    }

    @Test
    public void hasTotalWeight(){
        assertEquals(10, plane.getPlaneType().getTotalWeight());
    }

}
