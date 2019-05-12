public class Flight {

    private Plane plane;
    private String flightNum;
    private String destination;
    private int passengerCount;

    public Flight(Plane plane, String flightNum, String destination){
        this.plane = plane;
        this.flightNum = flightNum;
        this.destination = destination;
        this.passengerCount = 0;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return plane.getCapacity();
    }

    public void addPassengerToFlight(){
        passengerCount += 1;
    }

    public int countPassengers() {
        return passengerCount;
    }
}
