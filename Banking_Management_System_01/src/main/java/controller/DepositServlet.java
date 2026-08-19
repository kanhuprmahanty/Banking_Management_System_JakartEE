package controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import service.TransactionService;

import java.io.IOException;

@WebServlet("/deposit")
public class DepositServlet
extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        String accountNumber =
                request.getParameter(
                        "accountNumber");

        double amount =
                Double.parseDouble(
                request.getParameter(
                        "amount"));

        TransactionService service =
                new TransactionService();

        service.deposit(
                accountNumber,
                amount);

        response.sendRedirect(
                "accounts");
    }
}