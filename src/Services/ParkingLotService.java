package Services;

import Models.ParkingFloor;
import Models.ParkingLot;
import Models.ParkingSpot;
import Models.SpotType;
import Repository.ParkingFloorRepository;
import Repository.ParkingLotRepository;

import java.util.List;

public class ParkingLotService {
    private ParkingLotRepository parkingLotRepository;
    private ParkingFloorRepository parkingFloorRepository;

    public ParkingLotService(ParkingLotRepository parkingLotRepository, ParkingFloorRepository parkingFloorRepository) {
        this.parkingLotRepository = parkingLotRepository;
        this.parkingLotRepository = parkingLotRepository;
    }

    public ParkingLot createParkingLot(ParkingLot parkingLot) {
        return parkingLotRepository.save(parkingLot);
    }

    public ParkingLot updateAddress(Long id,String newAddress){
        //1. Get current parking lot
        //2. Update the address

        ParkingLot currParkingLot = parkingLotRepository.getById(id);
        currParkingLot.setAddress(newAddress);
        ParkingLot updatedParkingLot = parkingLotRepository.update(id,currParkingLot);
        return updatedParkingLot;

    }

    public ParkingFloor addParkingFloor(Long parkingLotId,int floorNumber) {

        ParkingLot parkingLot = parkingLotRepository.getById(parkingLotId);
        ParkingFloor parkingFloor = new ParkingFloor();
        parkingFloor.setFloorNumber(floorNumber);
        ParkingFloor savedParkingFloor = parkingFloorRepository.save(parkingFloor);
        ParkingLot UpdatedParkingLot = parkingLotRepository.update(parkingLot.getId(),parkingLot);
        return savedParkingFloor;
    }

    public List<ParkingSpot> addParkingSpot(Long parkingLotId, Long parkingFloorId, SpotType spotType, int numeberOfSpot) {
        //get parking lot
        //get parking floor
        // add spot
        // save spot
        // save parking floor
        // save parking spot

        return null;
    }
}
