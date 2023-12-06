package Models;

public class Vehicle extends BaseModel{
    private  String VehicleNumber;
    private  VehicleType vehicleType;
    private String Owner;

    public Vehicle(String vehicleNumber, VehicleType vehicleType, String owner) {
        VehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        Owner = owner;
    }

    public void setVehicleNumber(String VehicleNumber) {
        this.VehicleNumber = VehicleNumber;
    }
}
