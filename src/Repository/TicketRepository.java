package Repository;

import Models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    private Long lastCount = 0l;
    private Map<Long, Ticket> tickets = new HashMap();

    public Ticket save(Ticket ticket) {
        lastCount++;
        ticket.setId(lastCount);
        tickets.put(ticket.getId(),ticket);
        return ticket;

    }
}
