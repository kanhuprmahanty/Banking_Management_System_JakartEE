package controller;

import entity.Customer;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.CustomerService;

import java.io.IOException;
import java.util.List;

@WebServlet("/customers")
public class CustomerListServlet
extends HttpServlet {

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException,
            IOException {

        CustomerService service =
                new CustomerService();

        List<Customer> customers =
                service.getAllCustomers();

        request.setAttribute(
                "customers",
                customers);

        RequestDispatcher rd =
                request.getRequestDispatcher(
                        "customer-list.jsp");

        rd.forward(
                request,
                response);
    }
}