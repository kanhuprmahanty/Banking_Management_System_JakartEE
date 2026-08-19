package controller;

import entity.Customer;
import entity.SupportTicket;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.CustomerService;
import service.SupportTicketService;

import java.io.IOException;

@WebServlet("/raiseTicket")
public class RaiseTicketServlet
extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        int customerId =
                Integer.parseInt(
                request.getParameter(
                "customerId"));

        Customer customer =
                new CustomerService()
                .getCustomerById(
                customerId);

        SupportTicket ticket =
                new SupportTicket();

        ticket.setCustomer(
                customer);

        ticket.setSubject(
                request.getParameter(
                "subject"));

        ticket.setDescription(
                request.getParameter(
                "description"));

        ticket.setCategory(
                request.getParameter(
                "category"));

        ticket.setPriority(
                request.getParameter(
                "priority"));

        new SupportTicketService()
                .createTicket(ticket);

        response.sendRedirect(
                "tickets");
    }
}
