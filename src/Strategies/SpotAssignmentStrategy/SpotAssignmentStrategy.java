package Strategies.SpotAssignmentStrategy;

import Models.Gate;
import Models.ParkingSlot;
import Models.SlotAssignmentStrategyType;
import Models.VehicleType;

public interface SpotAssignmentStrategy {
//    static SpotAssignmentStrategy getStrategyByType(SlotAssignmentStrategyType spotAssignmentStrategyType) {
//    }

    ParkingSlot assignSpot(Gate gate, VehicleType vehicleType);
}
