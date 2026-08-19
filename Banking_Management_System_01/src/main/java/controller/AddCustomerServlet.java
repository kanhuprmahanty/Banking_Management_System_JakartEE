package controller;

import entity.Customer;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.CustomerService;

import java.io.IOException;

@WebServlet("/addCustomer")
public class AddCustomerServlet
extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        Customer customer =
                new Customer();

        customer.setFirstName(
                request.getParameter(
                        "firstName"));

        customer.setLastName(
                request.getParameter(
                        "lastName"));

        customer.setEmail(
                request.getParameter(
                        "email"));

        customer.setMobile(
                request.getParameter(
                        "mobile"));

        customer.setAddress(
                request.getParameter(
                        "address"));

        customer.setAadhaar(
                request.getParameter(
                        "aadhaar"));

        customer.setPan(
                request.getParameter(
                        "pan"));

        customer.setKycStatus(
                "PENDING");

        CustomerService service =
                new CustomerService();

        service.saveCustomer(
                customer);

        response.sendRedirect(
                "customers");
    }
}
