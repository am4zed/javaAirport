import java.util.ArrayList;

public class Airport {

    private String code;
    private ArrayList<Hangar> hangars;
    private ArrayList<Flight> flights;

    public Airport(String code){
        this.code = code;
        this.hangars = new ArrayList<>();
        this.flights = new ArrayList<>();
    }


    public String getCode() {
        return code;
    }

    public void addHangar(Hangar hangar) {
        hangars.add(hangar);
    }

    public int countHangars() {
        return hangars.size();
    }

    public int countTotalPlanes(){
        int totalPlanes = 0;
        for (Hangar hangar: hangars){
            totalPlanes += hangar.countPlanes();
        }
        return totalPlanes;
    }


    public int countFlights() {
        return flights.size();
    }

    public void createFlight(Hangar hangar, String flightNum, String destination) {
        Plane plane = hangar.getPlanefromHangar();
        Flight newFlight = new Flight(plane, flightNum, destination);
        flights.add(newFlight);
    }

    public void sellTicketForFlight(Flight flight, Passenger passenger) {
        if (flight.countPassengers() < flight.getCapacity()) {
            Ticket newTicket = new Ticket(flight, passenger);
            passenger.assignTicketToPassenger(newTicket);
            flight.addPassengerToFlight();
        }
    }

}
