package Services;

import Models.Vehicle;
import Models.VehicleType;
import Repository.VehicleRepository;

public class VehicleService {
    private VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public Vehicle createVehicle(String number, VehicleType vehicleType) {
        Vehicle vehicle = new Vehicle();
        vehicle.setNumber(number);
        vehicle.setVahicleType(vehicleType);

        Vehicle savedVehicle = vehicleRepository.save(vehicle);
        return savedVehicle;
    }
}
