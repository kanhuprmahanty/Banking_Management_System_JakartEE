package controller;

import entity.CreditCard;
import entity.Customer;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.CreditCardService;
import service.CustomerService;

@WebServlet("/applyCreditCard")
public class ApplyCreditCardServlet
extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response){

        try{

            int customerId =
                    Integer.parseInt(
                    request.getParameter(
                    "customerId"));

            Customer customer =
                    new CustomerService()
                    .getCustomerById(
                    customerId);

            CreditCard card =
                    new CreditCard();

            card.setCustomer(
                    customer);

            card.setCardType(
                    request.getParameter(
                    "cardType"));

            card.setCreditLimit(
                    Double.parseDouble(
                    request.getParameter(
                    "creditLimit")));

            new CreditCardService()
                    .applyCard(card);

            response.sendRedirect(
                    "creditCards");

        }catch(Exception e){

            e.printStackTrace();
        }
    }
}