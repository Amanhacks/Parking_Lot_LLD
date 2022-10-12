package Strategies;

import Models.EnteryGate;
import Models.ParkingLot;
import Models.ParkingSpot;
import Models.SpotType;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(ParkingLot parkingLot,
                           SpotType spotType,
                           EnteryGate enteryGate);
}
