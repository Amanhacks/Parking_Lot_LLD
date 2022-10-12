import Controller.ParkingLotController;
import Controller.TicketController;
import Dto.CreateParkingLotRequestDto;
import Dto.CreateParkingLotResponseDto;
import Dto.UpdateParkingLotRequestDto;
import Dto.UpdateParkingLotResponseDto;
import Repository.ParkingLotRepository;
import Repository.TicketRepository;
import Services.ParkingLotService;
import Services.TicketService;
import Strategies.RandomSpotAssignmentStrategy;
import Strategies.SpotAssignmentStrategy;

public class Main {
    public static void main(String[] args) {
        ObjectRegistry.put("spotAssignmentStrategy", new RandomSpotAssignmentStrategy());
        ObjectRegistry.put("ticketRepository",new TicketRepository());
        ObjectRegistry.put("ticketService",new TicketService(
                (TicketRepository) ObjectRegistry.get("ticketRepository"),
                (SpotAssignmentStrategy) ObjectRegistry.get("spotAssignmentStrategy"),
                (ParkingLotRepository) ObjectRegistry.get("parkingLotRepository")
        ));
        ObjectRegistry.put("ticketController", new TicketController(
                (TicketService) ObjectRegistry.get("ticketService")
        ));
        ObjectRegistry.put("parkingLotRepository",new ParkingLotRepository());
        ObjectRegistry.put("parkingLotService",new ParkingLotService(
                (ParkingLotRepository) ObjectRegistry.get("parkingLotRepository")
        ));

        ObjectRegistry.put("parkingLotController",new ParkingLotController(
                (ParkingLotService) ObjectRegistry.get("parkingLotService")
        ));
        ParkingLotController controller = (ParkingLotController) ObjectRegistry.get("parkingLotController");
        CreateParkingLotRequestDto createrequest = new CreateParkingLotRequestDto();
        createrequest.setAddress("Delhi Airport");
        createrequest.setNumberOfFloors(4);


        CreateParkingLotResponseDto response = controller.createParkingLot(createrequest);
        System.out.println(response.getParkingLot().getAddress());
        System.out.println(response.getParkingLot().getId());
        System.out.println(response.getParkingLot().getParkingFloors());

        UpdateParkingLotRequestDto updateRequest = new UpdateParkingLotRequestDto();
        updateRequest.setParkingLotId(1l);
        updateRequest.setAddress("Dhanbad");

        UpdateParkingLotResponseDto responseDto = controller.updateAddress(updateRequest);
        System.out.println(responseDto.getParkingLot().getAddress());

    }
}

/*
* Implement ticket controller code
*   - take request object and call the service, return the response
* Implement ticket repository and save the ticket into it
* Implement following use_case
*   1. create a vehicle
*   2. Add a spot of type to given floor of parking lot -> ParkingLotController
*
*
* */