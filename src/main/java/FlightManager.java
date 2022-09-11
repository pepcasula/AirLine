import java.util.ArrayList;

public class FlightManager {

    Flight flight;

    public FlightManager(Flight flight){
        this.flight = flight;
    }

    public int getMaxBagWeightPerPerson(){
        PlaneType plane = this.flight.plane.getPlaneType();
        int planeWeight = plane.getWeight();
        int planeCapacity = plane.getCapacity();
        return planeWeight / 2 / planeCapacity;
    }

    // The following methods assume that the single piece of baggage has a constant weight of 10Kg
    // Consequently, a customer who has 2 bags will bring on the plane 20Kg, etc.

    public int getActualBaggagePerPerson(Passenger passenger){
        int bags = passenger.getNumberOfBags();
        return bags * 10;
    }

    public int getTotalPassengersBaggage(){
        int totalPassengersBaggage = 0;
        for (Passenger passenger : this.flight.passengers){
            int passengerBaggage = getActualBaggagePerPerson(passenger);
            totalPassengersBaggage += passengerBaggage;
        }
        return totalPassengersBaggage;
    }

    public int getBaggageWeightRemaining(){
        PlaneType plane = this.flight.plane.getPlaneType();
        int planeWeightCapacity = plane.getWeight();
        int totalPassengersBaggage = getTotalPassengersBaggage();
        return planeWeightCapacity - totalPassengersBaggage;
    }
}
