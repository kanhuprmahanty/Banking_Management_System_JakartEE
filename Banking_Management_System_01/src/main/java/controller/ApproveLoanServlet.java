package controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.LoanService;

import java.io.IOException;

@WebServlet("/approveLoan")
public class ApproveLoanServlet
extends HttpServlet {

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        int loanId =
                Integer.parseInt(
                request.getParameter(
                "id"));

        LoanService service =
                new LoanService();

        service.approveLoan(
                loanId);

        response.sendRedirect(
                "loans");
    }
}
