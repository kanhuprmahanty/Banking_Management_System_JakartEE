package controller;

import entity.AuditLog;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import service.AuditLogService;

import java.io.IOException;
import java.util.List;

@WebServlet("/auditLogs")
public class AuditLogServlet
        extends HttpServlet {

    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException,
            IOException {

        List<AuditLog> logs =
                new AuditLogService()
                        .getLogs();

        req.setAttribute(
                "logs",
                logs);

        req.getRequestDispatcher(
                "audit-logs.jsp")
                .forward(
                        req,
                        resp);
    }
}
