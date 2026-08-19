package controller;

import entity.Loan;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.LoanService;

import java.io.IOException;
import java.util.List;

@WebServlet("/loans")
public class LoanListServlet
extends HttpServlet {

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException,
            IOException {

        LoanService service =
                new LoanService();

        List<Loan> loans =
                service.getAllLoans();

        request.setAttribute(
                "loans",
                loans);

        request.getRequestDispatcher(
                "loan-list.jsp")
                .forward(
                request,
                response);
    }
}