package controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.SupportTicketService;

import java.io.IOException;

@WebServlet("/resolveTicket")
public class ResolveTicketServlet
extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        int ticketId =
                Integer.parseInt(
                request.getParameter(
                "ticketId"));

        String resolution =
                request.getParameter(
                "resolution");

        new SupportTicketService()
                .resolveTicket(
                ticketId,
                resolution);

        response.sendRedirect(
                "tickets");
    }
}
