package controller;

import entity.SupportTicket;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.SupportTicketService;

import java.io.IOException;
import java.util.List;

@WebServlet("/tickets")
public class TicketListServlet
extends HttpServlet {

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException,
            IOException {

        List<SupportTicket> tickets =
                new SupportTicketService()
                .getAllTickets();

        request.setAttribute(
                "tickets",
                tickets);

        request.getRequestDispatcher(
                "ticket-list.jsp")
                .forward(
                request,
                response);
    }
}