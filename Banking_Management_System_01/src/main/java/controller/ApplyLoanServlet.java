package controller;

import entity.Customer;
import entity.Loan;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.CustomerService;
import service.LoanService;

import java.io.IOException;

@WebServlet("/applyLoan")
public class ApplyLoanServlet
extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        int customerId =
                Integer.parseInt(
                request.getParameter(
                "customerId"));

        CustomerService cs =
                new CustomerService();

        Customer customer =
                cs.getCustomerById(
                customerId);

        Loan loan =
                new Loan();

        loan.setCustomer(
                customer);

        loan.setLoanType(
                request.getParameter(
                "loanType"));

        loan.setAmount(
                Double.parseDouble(
                request.getParameter(
                "amount")));

        loan.setInterestRate(
                Double.parseDouble(
                request.getParameter(
                "interestRate")));

        loan.setDurationMonths(
                Integer.parseInt(
                request.getParameter(
                "durationMonths")));

        LoanService service =
                new LoanService();

        service.applyLoan(loan);

        response.sendRedirect(
                "loans");
    }
}