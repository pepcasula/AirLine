import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.ERJ135);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(40, plane.getPlaneCapacity());
    }

    @Test
    public void canGetBagWeightPerPerson(){
        assertEquals(40, plane.getBagWeightPerPerson());
    }
}
