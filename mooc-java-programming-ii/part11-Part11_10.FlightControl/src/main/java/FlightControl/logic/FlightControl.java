package FlightControl.logic;

import FlightControl.domain.AirPlane;
import FlightControl.domain.AirPort;
import FlightControl.domain.Flight;

import java.util.Collection;
import java.util.HashMap;

public class FlightControl {
    private HashMap<String,AirPlane> airplanes ;
    private HashMap<String,Flight> flights;

    public FlightControl() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
    }

    public void addAirPlanes(String airPlaneID, int airPlaneCapacity) {
        this.airplanes.put(airPlaneID, new AirPlane(airPlaneID,airPlaneCapacity));
    }

    public void addFlights(AirPlane airPlaneID, AirPort depAirPort, AirPort targetAirport){
        this.flights.put(flights.toString(),new Flight((AirPlane) airPlaneID,depAirPort,targetAirport));
    }

    public Collection<AirPlane> getAirplanes() {
        return this.airplanes.values();
    }

    public Collection<Flight> getFlights() {
        return this.flights.values();
    }

    public AirPlane getAirPlaneID(String ID){
        return this.airplanes.get(ID);
    }
}
