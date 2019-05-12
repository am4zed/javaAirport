import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangarTest {

    Hangar hangar1;
    Plane plane1;
    Plane plane2;
    Plane plane3;

    @Before
    public void before(){
        hangar1 = new Hangar();
        plane1 = new Plane(PlaneType.BOEING747, "British Airways");
        plane2 = new Plane(PlaneType.AIRBUSA380, "Emirates");
        plane3 = new Plane(PlaneType.AIRBUSA340, "Ryanair");
        hangar1.addPlaneToHangar(plane1);
        hangar1.addPlaneToHangar(plane2);
        hangar1.addPlaneToHangar(plane3);
    }

    @Test
    public void hasPlanes(){
        assertEquals(3, hangar1.countPlanes());
    }

    @Test
    public void canGetPlane(){
        assertEquals(plane1, hangar1.getPlanefromHangar());
    }


}
