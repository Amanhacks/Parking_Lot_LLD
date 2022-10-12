package Controller;

import Models.Vehicle;
import Models.VehicleType;
import Services.VehicleService;

public class VehicleController {
    private VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public Vehicle createVehicle(String number, VehicleType vehicleType) {
        return vehicleService.createVehicle(number,vehicleType);

    }
}
