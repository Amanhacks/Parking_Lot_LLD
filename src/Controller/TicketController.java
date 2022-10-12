package Controller;

import Dto.GenerateTicketRequestDto;
import Dto.GenerateTicketResponseDto;
import Models.Ticket;
import Services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto request) {
        Ticket savedTicket = ticketService.generateTicket(  request.getVehicle(),
                                                            request.getEnteryGate(),
                                                            request.getSpotType(),
                                                            request.getParkingLotId()
                                                        );
        GenerateTicketResponseDto response = new GenerateTicketResponseDto();
        response.setTicket(savedTicket);
        return response;
    }
}
