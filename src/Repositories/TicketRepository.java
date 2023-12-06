package Repositories;

import Models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    private Map<Long, Ticket> tickets = new HashMap<>();
    private Long previousId = 0L;
    public Ticket saveTicket(Ticket ticket){
        previousId += 1;
        ticket.setId(previousId);
        tickets.put(previousId, ticket);
        return  ticket;
    }
}
