package Services;

import Models.*;
import Repository.ParkingLotRepository;
import Repository.TicketRepository;
import Strategies.SpotAssignmentStrategy;

import java.util.Date;

public class TicketService {
    private TicketRepository ticketRepository;
    private SpotAssignmentStrategy spotAssignmentStrategy;
    private ParkingLotRepository parkingLotRepository;
    public TicketService(TicketRepository ticketRepository,SpotAssignmentStrategy spotAssignmentStrategy,ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
        this.spotAssignmentStrategy = spotAssignmentStrategy;
    }

    public Ticket generateTicket(Vehicle vehicle, EnteryGate enteryGate,SpotType spotType,Long parkingLotId) {
        ParkingLot parkingLot = parkingLotRepository.getById(parkingLotId);
        ParkingSpot parkingSpot = spotAssignmentStrategy.assignSpot(parkingLot,spotType,enteryGate);
        if(parkingLot == null) return null;

        Ticket ticket = new Ticket();
        ticket.setEnteryGate(enteryGate);
        ticket.setOperator(enteryGate.getOperator());
        ticket.setParkingSpot(parkingSpot);
        ticket.setVehicle(vehicle);
        ticket.setEnteryTime(new Date());

        Ticket savedTicket = ticketRepository.save(ticket);
        return ticket;

    }
}
