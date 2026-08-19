package service;

import dao.SupportTicketDAO;
import entity.Employee;
import entity.SupportTicket;

import java.util.Date;
import java.util.List;

public class SupportTicketService {

    private SupportTicketDAO dao =
            new SupportTicketDAO();

    public void createTicket(
            SupportTicket ticket){

        ticket.setStatus("OPEN");

        dao.save(ticket);
    }

    public void assignTicket(
            int ticketId,
            Employee employee){

        SupportTicket ticket =
                dao.getById(ticketId);

        ticket.setAssignedEmployee(
                employee);

        ticket.setStatus(
                "ASSIGNED");

        dao.update(ticket);
    }

    public void resolveTicket(
            int ticketId,
            String resolution){

        SupportTicket ticket =
                dao.getById(ticketId);

        ticket.setResolutionNotes(
                resolution);

        ticket.setStatus(
                "RESOLVED");

        ticket.setClosedDate(
                new Date());

        dao.update(ticket);
    }

    public List<SupportTicket>
    getAllTickets(){

        return dao.getAll();
    }
}