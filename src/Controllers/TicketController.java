package Controllers;

import Controllers.dto.IssueTicketRequestDto;
import Controllers.dto.IssueTicketResponseDto;
import Controllers.dto.ResponseStatus;
import Models.Ticket;
import Services.TicketService;

public class TicketController {
    private TicketService ticketService; //dependence injection

    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;

    }
   public IssueTicketResponseDto issueTicket(IssueTicketRequestDto request){
        IssueTicketResponseDto response = new IssueTicketResponseDto();
        Ticket ticket;
        try {


             ticket = ticketService.issueTicket(
                    request.getVehicleType(),
                    request.getVehicleNumber(),
                    request.getVehicleOwnerName(),
                    request.getGateId()
            );

        } catch(Exception ex){
            System.out.println("There was an error in issuTicket with "+ex);
            response.setResponseStatus(ResponseStatus.FAILURE); // catching the exception thrown from service user will simply see the line 30 msg
            return  response;
        }
        response.setTicket(ticket);
        response.setResponseStatus(ResponseStatus.SUCCESS);
        return  response;
    }
}
