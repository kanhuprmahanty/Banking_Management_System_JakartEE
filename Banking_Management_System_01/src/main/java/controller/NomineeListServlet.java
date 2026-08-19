package controller;

import entity.Nominee;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.NomineeService;

import java.io.IOException;
import java.util.List;

@WebServlet("/nominees")
public class NomineeListServlet
extends HttpServlet {

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException,
            IOException {

        List<Nominee> nominees =
                new NomineeService()
                .getAllNominees();

        request.setAttribute(
                "nominees",
                nominees);

        request.getRequestDispatcher(
                "nominee-list.jsp")
                .forward(
                request,
                response);
    }
}