package Repository;

import Models.BaseModel;
import Models.ParkingFloor;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepository {

    private Map<Long, ParkingFloor> parkingFloorMap = new HashMap<>();
    private Long lastCount = 0l;

    public ParkingFloor save(ParkingFloor parkingFloor) {
        lastCount++;
        parkingFloor.setId(lastCount);
        parkingFloorMap.put(lastCount,parkingFloor);
        return parkingFloor;

    }
}
