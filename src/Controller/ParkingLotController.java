package Controller;

import Dto.CreateParkingLotRequestDto;
import Dto.CreateParkingLotResponseDto;
import Dto.UpdateParkingLotRequestDto;
import Dto.UpdateParkingLotResponseDto;
import Models.ParkingFloor;
import Models.ParkingLot;
import Models.ParkingSpot;
import Models.SpotType;
import Services.ParkingLotService;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotController {

    private ParkingLotService parkingLotService;


    public ParkingLotController(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }

    public CreateParkingLotResponseDto createParkingLot(CreateParkingLotRequestDto request) {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setAddress(request.getAddress()) ;
        List<ParkingFloor> parkingFloors = new ArrayList<>();
        for(int i=0;i<request.getNumberOfFloors();i++) {
            ParkingFloor parkingFloor = parkingLotService.addParkingFloor(parkingLot.getId(),i+1);
            List<ParkingSpot> savedSmallParkingSpot = parkingLotService.addParkingSpot(parkingLot.getId(),parkingFloor.getId(), SpotType.SMALL,5);
            List<ParkingSpot> savedMediumParkingSpot= parkingLotService.addParkingSpot(parkingLot.getId(),parkingFloor.getId(), SpotType.MEDIUM,5);
            List<ParkingSpot> savedLargeParkingSpot= parkingLotService.addParkingSpot(parkingLot.getId(),parkingFloor.getId(), SpotType.LARGE,5);

        }
        parkingLot.setParkingFloors(parkingFloors);
        ParkingLot createdParkingLot = parkingLotService.createParkingLot( parkingLot);
        CreateParkingLotResponseDto response = new CreateParkingLotResponseDto(createdParkingLot);
        return response;
    };

    public UpdateParkingLotResponseDto updateAddress(UpdateParkingLotRequestDto request) {
        ParkingLot updatedParkingLot = parkingLotService.updateAddress(
                request.getParkingLotId(),request.getAddress()
        );

        UpdateParkingLotResponseDto response = new UpdateParkingLotResponseDto();
        response.setParkingLot(updatedParkingLot);

        return response;
    }
    //addSlotToParkingLot();

    //getParkingLotInCity();

    //delete();
}

// the arguments that is getting passed to the controller method might change with time, so best way to interact with
// controller methods are DTO's
/*
* dto -> Data transefer object
* easily extensible
* hiding internal details
* dto for public
* model for internal uses
* */
