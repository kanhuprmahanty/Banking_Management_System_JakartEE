package controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.CustomerService;

import java.io.IOException;

@WebServlet("/deleteCustomer")
public class DeleteCustomerServlet
extends HttpServlet {

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        int id =
                Integer.parseInt(
                request.getParameter(
                        "id"));

        CustomerService service =
                new CustomerService();

        service.deleteCustomer(id);

        response.sendRedirect(
                "customers");
    }
}