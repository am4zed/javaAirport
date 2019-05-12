import java.util.ArrayList;

public class Hangar {

    private ArrayList<Plane> planes;

    public Hangar(){
        this.planes = new ArrayList<>();
    }

    public void addPlaneToHangar(Plane plane) {
        planes.add(plane);
    }

    public int countPlanes() {
        return planes.size();
    }

    public Plane getPlanefromHangar() {
        return planes.get(0);
    }
}
