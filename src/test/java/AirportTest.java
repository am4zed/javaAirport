import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport;
    Hangar hangar1;
    Hangar hangar2;
    Plane plane1;
    Plane plane2;
    Plane plane3;
    Plane plane4;
    Plane plane5;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Flight flight1;
    Flight flight2;
    Flight flight3;

    @Before
    public void before(){
        airport = new Airport("EDI");
        hangar1 = new Hangar();
        hangar2 = new Hangar();
        plane1 = new Plane(PlaneType.BOEING747, "British Airways");
        plane2 = new Plane(PlaneType.AIRBUSA380, "Emirates");
        plane3 = new Plane(PlaneType.AIRBUSA340, "Ryanair");
        plane4 = new Plane(PlaneType.AIRBUSA340, "Emirates");
        plane5 = new Plane(PlaneType.PRIVATEPLANE, "Private");
        airport.addHangar(hangar1);
        airport.addHangar(hangar2);
        hangar1.addPlaneToHangar(plane1);
        hangar1.addPlaneToHangar(plane2);
        hangar1.addPlaneToHangar(plane3);
        hangar2.addPlaneToHangar(plane4);
        flight1 = new Flight(plane1, "EM2308", "Dubai");
        flight2 = new Flight(plane2, "BA3453", "Paris");
        flight3 = new Flight(plane5, "P234", "Rome");
        passenger1 = new Passenger("Tim");
        passenger2 = new Passenger("Sharon");
        passenger3 = new Passenger("Pat");
        passenger4 = new Passenger("Rachael");


    }

    @Test
    public void hasCode(){
        assertEquals("EDI", airport.getCode());
    }

    @Test
    public void hasHangars(){
        assertEquals(2, airport.countHangars());
    }

    @Test
    public void canCountTotalPlanes(){
        assertEquals(4, airport.countTotalPlanes());
    }

    @Test
    public void canCreateFlight(){
        assertEquals(0, airport.countFlights());
        airport.createFlight(hangar1, "EM2308", "Dubai");
        assertEquals(1, airport.countFlights());
    }

    @Test
    public void canSellTicketForFlight(){
    airport.sellTicketForFlight(flight1, passenger1);
    assertEquals(1, passenger1.countTickets());
    }

    @Test
    public void cannotSellTicketForFlightIfCapacityReached(){
        airport.sellTicketForFlight(flight3, passenger1);
        airport.sellTicketForFlight(flight3, passenger2);
        airport.sellTicketForFlight(flight3, passenger3);
        airport.sellTicketForFlight(flight3, passenger4);
        assertEquals(3, flight3.countPassengers());
    }

}
