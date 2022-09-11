import java.util.ArrayList;

public class Flight {

    ArrayList<Pilot> pilots;
    ArrayList<CabinCrewMember> cabinCrewMembers;
    ArrayList<Passenger> passengers;
    Plane plane;
    String flightNumber;
    String destination;
    String departureAirport;
    String departureTime;

    public Flight(ArrayList<Pilot> pilots,
                  ArrayList<CabinCrewMember> cabinCrewMembers,
                  ArrayList<Passenger> passengers,
                  Plane plane,
                  String flightNumber,
                  String destination,
                  String departureAirport,
                  String departureTime){
        this.pilots = pilots;
        this.cabinCrewMembers = cabinCrewMembers;
        this.passengers = passengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public int getAvailableSeats(){
        return this.plane.getPlaneType().getCapacity() - this.passengers.size();
    }

    public void bookPassenger(Passenger passenger) {
        if ((this.plane.getPlaneType().getCapacity() - this.passengers.size()) >= 1) {
            this.passengers.add(passenger);
        }
    }

}
