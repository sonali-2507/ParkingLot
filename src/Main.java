import Controllers.TicketController;
import Controllers.dto.IssueTicketRequestDto;
import Controllers.dto.IssueTicketResponseDto;
import Repositories.GateRepositories;
import Repositories.ParkingLotRepository;
import Repositories.TicketRepository;
import Repositories.VehicleRepository;
import Services.TicketService;

public class Main {
    public static void main(String[] args) {
        //what will get initialised first
        GateRepositories gateRepositories = new GateRepositories();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        TicketService ticketService = new TicketService(gateRepositories,vehicleRepository, parkingLotRepository,ticketRepository);
        TicketController ticketController = new TicketController(ticketService);

        System.out.println("Application is ready");
//        IssueTicketResponseDto response = new IssueTicketResponseDto();
//        IssueTicketRequestDto request = new IssueTicketRequestDto();
//        response = ticketController.issueTicket(request);

        //pending stuffs
        //parking spot creation
        //payment strategies
        //api to get no. of slots
        //Bill

    }
}