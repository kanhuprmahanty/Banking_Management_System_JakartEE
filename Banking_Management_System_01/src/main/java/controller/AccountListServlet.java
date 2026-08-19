package controller;

import entity.Account;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.AccountService;

import java.io.IOException;
import java.util.List;

@WebServlet("/accounts")
public class AccountListServlet
extends HttpServlet {

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException,
            IOException {

        AccountService service =
                new AccountService();

        List<Account> accounts =
                service.getAllAccounts();

        request.setAttribute(
                "accounts",
                accounts);

        request.getRequestDispatcher(
                "account-list.jsp")
                .forward(
                request,
                response);
    }
}