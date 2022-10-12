package Dto;

import Models.EnteryGate;
import Models.SpotType;
import Models.Vehicle;

public class GenerateTicketRequestDto {
    private Vehicle vehicle;
    private EnteryGate enteryGate;

    private Long parkingLotId;

    private SpotType spotType;

    public SpotType getSpotType() {
        return spotType;
    }

    public void setSpotType(SpotType spotType) {
        this.spotType = spotType;
    }

    public Long getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(Long parkingLotId) {
        this.parkingLotId = parkingLotId;
    }


    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public EnteryGate getEnteryGate() {
        return enteryGate;
    }

    public void setEnteryGate(EnteryGate enteryGate) {
        this.enteryGate = enteryGate;
    }
}
