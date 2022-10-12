package Dto;

import Models.ParkingLot;

public class CreateParkingLotResponseDto {
    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    private ParkingLot parkingLot;

    public CreateParkingLotResponseDto(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }
}
