import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Olga Dimitrova", CabinCrewMemberRank.PURSER);
    }

    @Test
    public void canGetName(){
        assertEquals("Olga Dimitrova", cabinCrewMember.getName());
    }

    @Test
    public void canSetName(){
        cabinCrewMember.setName("Arnold Von Krapfen");
        assertEquals("Arnold Von Krapfen", cabinCrewMember.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals(CabinCrewMemberRank.PURSER, cabinCrewMember.getRank());
    }

    @Test
    public void canRelayLandingMessage(){
        assertEquals("Please fasten your seat belt and prepare for landing", cabinCrewMember.relayLandingMessage());
    }

    @Test
    public void canRelayTakeOffMessage(){
        assertEquals("Please fasten your seat belt and prepare for take-off", cabinCrewMember.relayTakeOffMessage());
    }
}
