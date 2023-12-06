package Models;

import java.util.List;

public class ParkingSlot extends  BaseModel{
    private List<VehicleType> supportedVehicleTypes;
    private ParkingSpotStatus parkingSpotStatus;
    private  int spotNumber;
    private ParkingFloor parkingFloor;

}
