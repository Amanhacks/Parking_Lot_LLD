package Repository;

import Models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    private Long lastCount = 0l;
    private Map<Long,ParkingLot> parkingLotMap = new HashMap<>();
    public ParkingLot save(ParkingLot parkingLot) {
        lastCount+=1;
        parkingLot.setId(lastCount);
        parkingLotMap.put(parkingLot.getId(),parkingLot);
        return parkingLot;
    }

    public ParkingLot getById(Long id) {
        return this.parkingLotMap.get(id);
    }

    public ParkingLot update(Long id,ParkingLot parkingLot) {
        parkingLotMap.put(id,parkingLot);
        return parkingLotMap.get(id);
    }
}
