package controller;

import entity.Customer;
import entity.Nominee;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.CustomerService;
import service.NomineeService;

import java.io.IOException;

@WebServlet("/addNominee")
public class AddNomineeServlet
extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        int customerId =
                Integer.parseInt(
                request.getParameter(
                "customerId"));

        Customer customer =
                new CustomerService()
                .getCustomerById(
                customerId);

        Nominee nominee =
                new Nominee();

        nominee.setCustomer(
                customer);

        nominee.setNomineeName(
                request.getParameter(
                "nomineeName"));

        nominee.setRelationship(
                request.getParameter(
                "relationship"));

        nominee.setMobileNumber(
                request.getParameter(
                "mobile"));

        nominee.setEmail(
                request.getParameter(
                "email"));

        nominee.setAddress(
                request.getParameter(
                "address"));

        nominee.setNomineeSharePercentage(
                Double.parseDouble(
                request.getParameter(
                "share")));

        new NomineeService()
                .addNominee(
                nominee);

        response.sendRedirect(
                "nominees");
    }
}