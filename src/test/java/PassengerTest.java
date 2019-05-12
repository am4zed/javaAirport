import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;

    @Before
    public void before(){
        passenger1 = new Passenger("Sadie");
    }

    @Test
    public void hasName(){
        assertEquals("Sadie", passenger1.getName());
    }
}
