package controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.NotificationService;

import java.io.IOException;

@WebServlet("/sendNotification")
public class SendNotificationServlet
extends HttpServlet {

    protected void doPost(
            HttpServletRequest req,
            HttpServletResponse resp)
            throws IOException {

        String title =
                req.getParameter(
                "title");

        String message =
                req.getParameter(
                "message");

        String type =
                req.getParameter(
                "type");

        int userId =
                Integer.parseInt(
                req.getParameter(
                "userId"));

        new NotificationService()
                .createNotification(
                title,
                message,
                type,
                userId);

        resp.sendRedirect(
                "notifications");
    }
}