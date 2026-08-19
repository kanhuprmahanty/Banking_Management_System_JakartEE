package controller;

import entity.Account;
import entity.Customer;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.AccountService;
import service.CustomerService;

import java.io.IOException;

@WebServlet("/createAccount")
public class CreateAccountServlet
extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        int customerId =
                Integer.parseInt(
                request.getParameter(
                "customerId"));

        String accountType =
                request.getParameter(
                "accountType");

        double balance =
                Double.parseDouble(
                request.getParameter(
                "balance"));

        CustomerService cs =
                new CustomerService();

        Customer customer =
                cs.getCustomerById(
                customerId);

        Account account =
                new Account();

        account.setAccountType(
                accountType);

        account.setBalance(
                balance);

        account.setCustomer(
                customer);

        AccountService service =
                new AccountService();

        service.createAccount(
                account);

        response.sendRedirect(
                "accounts");
    }
}
