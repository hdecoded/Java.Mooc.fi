package FlightControl.domain;

public class Flight {
    private AirPlane airPlane;
    private AirPort depAirPort;
    private AirPort targetAirport;

    public Flight(AirPlane airPlane, AirPort depAirPort, AirPort targetAirport) {
        this.airPlane = airPlane;
        this.depAirPort = depAirPort;
        this.targetAirport = targetAirport;
    }

    public AirPlane getAirPlane() {
        return airPlane;
    }

    public AirPort getDepAirPort() {
        return depAirPort;
    }

    public AirPort getTargetAirport() {
        return targetAirport;
    }

    @Override
    public String toString() {
        return this.airPlane.toString() + " (" + this.depAirPort.getId() + "-" +this.targetAirport.getId() + ")";
    }
}
