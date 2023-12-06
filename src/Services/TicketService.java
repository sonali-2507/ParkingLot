package Services;

import Exceptions.GateNotFoundException;
import Models.*;
import Repositories.GateRepositories;
import Repositories.ParkingLotRepository;
import Repositories.TicketRepository;
import Repositories.VehicleRepository;
import Strategies.SpotAssignmentStrategy.SpotAssignmentStrategy;
import Strategies.SpotAssignmentStrategy.SpotAssignmentStrategyFactory;

import java.util.Date;
import java.util.Optional;
import java.util.Vector;

public class TicketService {
    private GateRepositories gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    public TicketService(GateRepositories gateRepository, VehicleRepository vehicleRepository, ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(VehicleType vehicleType,
                              String vehicleNumber,
                              String vehicleOwnerName,
                              Long gateId ) throws GateNotFoundException {

       //create a ticket object
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        //set up for my ticket object
       //this optional bcoz it can be null
       Optional<Gate> gateOptional = gateRepository.getGateById(gateId);

       if(gateOptional.isEmpty())  {
           throw new GateNotFoundException(); //throwing exception from service n will catch it in controller, this s not exposed to user
       }
        Gate gate = gateOptional.get();
        ticket.setGeneratedAt(gateOptional.get());
        ticket.setGeneratedBy(gate.getOperator()); //set operator

       //set up vehicle in ticket object

       //check if vehicle in db
        //1.if yes->
            //gate vehicle from db
            //put that in ticket obj
        //2. No->
            //create obj of the vehicle n save it in the DB
            //put in ticket object
        Optional<Vehicle> vehicleOptional = vehicleRepository.getVehicleByNumber(vehicleNumber);
        Vehicle savedVehicle;

        if (vehicleOptional.isEmpty()){
            Vehicle vehicle = new Vehicle(vehicleNumber, vehicleType, vehicleOwnerName);
            savedVehicle = vehicleRepository.saveVehicle(vehicle);
        }else{
            savedVehicle = vehicleOptional.get();
        }
        ticket.setVehicle(savedVehicle);

        //assign spot to the vehicle
        //spot assignment strategy
       //parking lot has ->type of spot assignment strategy
       //with this type I can get actual object via same factory


       //get parking lot from gate
       ParkingLot parkingLot = parkingLotRepository.getParkingLotByGate(gate);
       SlotAssignmentStrategyType spotAssignmentStrategyType = parkingLot.getSlotAssignmentStrategyType();
       SpotAssignmentStrategy spotAssignmentStrategy = SpotAssignmentStrategyFactory.getStrategyByType(spotAssignmentStrategyType);

       ticket.setAssignSlot(spotAssignmentStrategy.assignSpot(gate,vehicleType));
       Ticket savedTicket = ticketRepository.saveTicket(ticket);
       ticket.setNumber("Ticket-"+savedTicket.getId());
       //return ticket object
        return ticket;
    }
}
