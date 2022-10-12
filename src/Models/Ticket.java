package Models;

import java.util.Date;

public class Ticket extends BaseModel {
    private Date enteryTime;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private Operator operator;

    private ParkingLot parkingLot;
    private EnteryGate enteryGate;
    private String ownerName;

    public Date getEnteryTime() {
        return enteryTime;
    }

    public void setEnteryTime(Date enteryTime) {
        this.enteryTime = enteryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public EnteryGate getEnteryGate() {
        return enteryGate;
    }

    public void setEnteryGate(EnteryGate enteryGate) {
        this.enteryGate = enteryGate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
