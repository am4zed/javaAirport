import java.util.ArrayList;

public class Plane {

    private PlaneType planeType;
    private String airline;
    private ArrayList<Passenger> passengers;

    public Plane(PlaneType planeType, String airline){
        this.planeType = planeType;
        this.airline = airline;
        this.passengers = new ArrayList<>();
    }

    public int countPassengers() {
        return passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public int getCapacity() {
        return planeType.getCapacity();
    }

    public String getAirline() {
        return airline;
    }
}
