import java.util.ArrayList;

public class Passenger {

    private String name;
    private ArrayList<Ticket> tickets;

    public Passenger(String name){

        this.name = name;
        this.tickets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int countTickets() {
        return tickets.size();
    }

    public void assignTicketToPassenger(Ticket ticket){
        this.tickets.add(ticket);
    }
}
