package controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import service.TransactionService;

import java.io.IOException;

@WebServlet("/transfer")
public class TransferServlet
extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        String fromAccount =
                request.getParameter(
                "fromAccount");

        String toAccount =
                request.getParameter(
                "toAccount");

        double amount =
                Double.parseDouble(
                request.getParameter(
                "amount"));

        TransactionService service =
                new TransactionService();

        service.transfer(
                fromAccount,
                toAccount,
                amount);

        response.sendRedirect(
                "transactions");
    }
}