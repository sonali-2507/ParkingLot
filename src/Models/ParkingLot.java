package Models;

import java.util.List;

public class ParkingLot {
    private List<ParkingFloor>parkingFloors;
    private List<Gate> gates;
    private List<VehicleType> vehicleTypes;
    private ParkingLotStatus parkingLotStatus;
    private  SlotAssignmentStrategyType slotAssignmentStrategyType;
    private FeeCalculatorStrategyType feeCalculatorStrategyType;

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<VehicleType> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public SlotAssignmentStrategyType getSlotAssignmentStrategyType() {
        return slotAssignmentStrategyType;
    }

    public void setSlotAssignmentStrategyType(SlotAssignmentStrategyType slotAssignmentStrategyType) {
        this.slotAssignmentStrategyType = slotAssignmentStrategyType;
    }

    public FeeCalculatorStrategyType getFeeCalculatorStrategyType() {
        return feeCalculatorStrategyType;
    }

    public void setFeeCalculatorStrategyType(FeeCalculatorStrategyType feeCalculatorStrategyType) {
        this.feeCalculatorStrategyType = feeCalculatorStrategyType;
    }
}
