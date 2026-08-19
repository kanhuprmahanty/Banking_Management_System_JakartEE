package controller;

import entity.Transaction;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import service.TransactionService;

import java.io.IOException;
import java.util.List;

@WebServlet("/transactions")
public class TransactionHistoryServlet
extends HttpServlet {

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException,
            IOException {

        TransactionService service =
                new TransactionService();

        List<Transaction> transactions =
                service.getAllTransactions();

        request.setAttribute(
                "transactions",
                transactions);

        request.getRequestDispatcher(
                "transaction-history.jsp")
                .forward(
                request,
                response);
    }
}