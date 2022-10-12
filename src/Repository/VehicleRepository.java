package Repository;

import Models.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicleRepository {
    private Map<Long,Vehicle> vehicles = new HashMap();
    private Long lastCount = 0l;

    public Vehicle save(Vehicle vehicle) {
        lastCount++;
        vehicle.setId(lastCount);
        vehicles.put(vehicle.getId(),vehicle);
        return vehicle;
    }
}
