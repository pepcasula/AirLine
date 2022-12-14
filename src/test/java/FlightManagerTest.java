import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;

    Plane plane;

    Pilot pilot1;
    Pilot pilot2;
    ArrayList<Pilot> pilots;

    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3;
    ArrayList<CabinCrewMember> cabinCrewMembers;

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    ArrayList<Passenger> passengers;

    @Before
    public void before() {

        plane = new Plane(PlaneType.ERJ135);

        passengers = new ArrayList<Passenger>();
        passenger1 = new Passenger("Daniel Bigtooth", 2);
        passenger2 = new Passenger("Teresa Keller", 2);
        passenger3 = new Passenger("Johnny Benson", 1);
        passenger4 = new Passenger("Alessia Di Biagio", 1);
        passenger5 = new Passenger("Ester Plum", 3);
        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);
        passengers.add(passenger4);
        passengers.add(passenger5);

        cabinCrewMembers = new ArrayList<CabinCrewMember>();
        cabinCrewMember1 = new CabinCrewMember("Albert Fox", CabinCrewMemberRank.FLIGHT_ATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Veronica Pereiro", CabinCrewMemberRank.FLIGHT_ATTENDANT);
        cabinCrewMember3 = new CabinCrewMember("Olga Dimitrova", CabinCrewMemberRank.PURSER);
        cabinCrewMembers.add(cabinCrewMember1);
        cabinCrewMembers.add(cabinCrewMember2);
        cabinCrewMembers.add(cabinCrewMember3);

        pilots = new ArrayList<Pilot>();
        pilot1 = new Pilot("Kyle Yannick", "UK-K3456J", PilotRank.CAPTAIN);
        pilot2 = new Pilot("Remco Filarski", "NL-A1234B", PilotRank.CO_PILOT);
        pilots.add(pilot1);
        pilots.add(pilot2);

        flight = new Flight(
                pilots,
                cabinCrewMembers,
                passengers,
                plane,
                "ZX6632",
                "Belfast",
                "EDI",
                "20:35"
        );

        flightManager = new FlightManager(flight);

    }

    @Test
    public void canGetMaxBagWeightPerPerson(){
        assertEquals(40, flightManager.getMaxBagWeightPerPerson());
    }

    @Test
    public void canGetActualBaggagePerPerson(){
        assertEquals(30, flightManager.getActualBaggagePerPerson(passenger5));
    }

    @Test
    public void canGetTotalPassengersBaggage(){
        assertEquals(90, flightManager.getTotalPassengersBaggage());
    }

    @Test
    public void canGetBaggageWeightRemaining(){
        assertEquals(3110, flightManager.getBaggageWeightRemaining());
    }

}