package Models;

public class ElectricParkingSpot extends ParkingSpot{
    private ElectricCharger electricCharger;
    ElectricParkingSpot(ElectricCharger electricCharget) {
        this.electricCharger = electricCharger;
    }
}
