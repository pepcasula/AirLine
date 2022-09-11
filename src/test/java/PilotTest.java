import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Remco Filarski", "NL-A1234B", PilotRank.CO_PILOT);
    }

    @Test
    public void canGetName(){
        assertEquals("Remco Filarski", pilot.getName());
    }

    @Test
    public void canSetName(){
        pilot.setName("Kristine Wessler");
    }

    @Test
    public void pilotHasLicense(){
        pilot.getLicenseNumber();
    }

    @Test
    public void canSetLicense(){
        pilot.setLicenseNumber("BE-C2345Z");
        assertEquals("BE-C2345Z", pilot.getLicenseNumber());
    }

    @Test
    public void canGetRank(){
        assertEquals(PilotRank.CO_PILOT, pilot.getRank());
    }

}
