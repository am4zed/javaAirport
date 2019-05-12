import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747, "Emirates");
        passenger1 = new Passenger("Fred");
        passenger1 = new Passenger("Pat");
        passenger1 = new Passenger("Louise");


    }

    @Test
    public void hasPlaneType(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void hasCapacity(){
        assertEquals(600, plane.getCapacity());
    }

    @Test
    public void hasAirline(){
        assertEquals("Emirates", plane.getAirline());
    }

    @Test
    public void canAddPassengers(){
        assertEquals(0, plane.countPassengers());
        plane.addPassenger(passenger1);
        plane.addPassenger(passenger2);
        plane.addPassenger(passenger3);
        assertEquals(3, plane.countPassengers());
    }
}
