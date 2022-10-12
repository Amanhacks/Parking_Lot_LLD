package Models;

import java.util.List;

public class ParkingLot extends BaseModel {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<EnteryGate> getEnteryGates() {
        return enteryGates;
    }

    public void setEnteryGates(List<EnteryGate> enteryGates) {
        this.enteryGates = enteryGates;
    }

    public List<ExitGate> getExitGates() {
        return exitGates;
    }

    public void setExitGates(List<ExitGate> exitGates) {
        this.exitGates = exitGates;
    }

    private List<ParkingFloor> parkingFloors;
    private List<EnteryGate> enteryGates;
    private List<ExitGate> exitGates;
}
