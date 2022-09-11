import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Suzanna Kramer", 2);
    }

    @Test
    public void canGetName(){
        assertEquals("Suzanna Kramer", passenger.getName());
    }

    @Test
    public void canSetName(){
        passenger.setName("Sylvia Tappenbeck");
        assertEquals("Sylvia Tappenbeck", passenger.getName());
    }

    @Test
    public void cangetNumberOfBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }

    @Test
    public void canSetNumberOfBags(){
        passenger.setNumberOfBags(2);
        assertEquals(2, passenger.getNumberOfBags());
    }

}
