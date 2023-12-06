package Models;

import java.util.Date;

public class Ticket extends BaseModel{
    private String number;
    private Date entryTime;
    private  Vehicle vehicle;
    private ParkingSlot assignSlot;
    private Gate generatedAt;
    private Operator generatedBy;

    public String getNumber() {
        return number;
    }
    public Long getId(){
        return  id;
    }
    public  void setId(Long id){
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSlot getAssignSlot() {
        return assignSlot;
    }

    public void setAssignSlot(ParkingSlot assignSlot) {
        this.assignSlot = assignSlot;
    }

    public Gate getGeneratedAt() {
        return generatedAt;
    }

    public void setGeneratedAt(Gate generatedAt) {
        this.generatedAt = generatedAt;
    }

    public Operator getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(Operator generatedBy) {
        this.generatedBy = generatedBy;
    }
}
