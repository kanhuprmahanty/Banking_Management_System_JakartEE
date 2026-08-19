package controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.NotificationService;

import java.io.IOException;

@WebServlet("/markRead")
public class MarkNotificationReadServlet
extends HttpServlet {

    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse resp)
            throws IOException {

        int id =
                Integer.parseInt(
                req.getParameter("id"));

        new NotificationService()
                .markAsRead(id);

        resp.sendRedirect(
                "notifications");
    }
}