package controller;

import entity.Notification;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.NotificationService;

import java.io.IOException;
import java.util.List;

@WebServlet("/notifications")
public class NotificationServlet
extends HttpServlet {

    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException,
            IOException {

        List<Notification> list =
                new NotificationService()
                .getNotifications();

        req.setAttribute(
                "notifications",
                list);

        req.getRequestDispatcher(
                "notification-center.jsp")
                .forward(
                req,
                resp);
    }
}