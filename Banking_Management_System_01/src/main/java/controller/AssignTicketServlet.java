package controller;

import entity.Employee;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.EmployeeService;
import service.SupportTicketService;

import java.io.IOException;

@WebServlet("/assignTicket")
public class AssignTicketServlet
extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        int ticketId =
                Integer.parseInt(
                request.getParameter(
                "ticketId"));

        int employeeId =
                Integer.parseInt(
                request.getParameter(
                "employeeId"));

        Employee employee =
                new EmployeeService()
                .getEmployee(
                employeeId);

        new SupportTicketService()
                .assignTicket(
                ticketId,
                employee);

        response.sendRedirect(
                "tickets");
    }
}