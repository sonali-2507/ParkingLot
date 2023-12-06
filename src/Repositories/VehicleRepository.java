package Repositories;

import Models.Vehicle;
import Models.VehicleType;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicleRepository {
    private Map<String, Vehicle> vehicleMap = new HashMap<>();
    String number;
    public Optional<Vehicle> getVehicleByNumber(String number){
        if(vehicleMap.containsKey(number)){
            return Optional.of(vehicleMap.get(number));
        }
        return Optional.empty();
    }

    public  Vehicle saveVehicle(Vehicle vehicle){
        vehicle.setVehicleNumber(number);
        vehicleMap.put(number,vehicle);
        return  vehicle;
    }
}
