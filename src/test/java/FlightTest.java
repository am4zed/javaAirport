import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight1;
    Flight flight2;
    Plane plane1;
    Plane plane2;

    @Before
    public void before(){
        plane1 = new Plane(PlaneType.AIRBUSA340, "Emirates");
        plane2 = new Plane(PlaneType.AIRBUSA380, "British Airways");
        flight1 = new Flight(plane1, "EM2308", "Dubai");
        flight2 = new Flight(plane2, "BA3453", "Paris");
    }

    @Test
    public void hasPlane(){
        assertEquals(plane1, flight1.getPlane());
    }

    @Test
    public void hasFlightNum(){
        assertEquals("BA3453", flight2.getFlightNum());
    }

    @Test
    public void hasDestination(){
        assertEquals("Dubai", flight1.getDestination());
    }

    @Test
    public void canCheckFlightCapacity(){
        assertEquals(295, flight1.getCapacity());
    }

    @Test
    public void canAddPassengerToFlight(){
        assertEquals(0, flight1.countPassengers());
        flight1.addPassengerToFlight();
        assertEquals(1, flight1.countPassengers());
    }
}
