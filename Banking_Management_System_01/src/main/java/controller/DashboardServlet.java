package controller;

import dto.DashboardDTO;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.DashboardService;

import java.io.IOException;

@WebServlet("/dashboard")
public class DashboardServlet
extends HttpServlet {

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException,
            IOException {

        DashboardService service =
                new DashboardService();

        DashboardDTO dto =
                service.getDashboardData();

        request.setAttribute(
                "dashboard",
                dto);

        RequestDispatcher rd =
                request.getRequestDispatcher(
                        "admin-dashboard.jsp");

        rd.forward(
                request,
                response);
    }
}
