package controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.CreditCardService;

@WebServlet("/approveCreditCard")
public class ApproveCreditCardServlet
extends HttpServlet {

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response){

        try{

            int cardId =
                    Integer.parseInt(
                    request.getParameter(
                    "id"));

            new CreditCardService()
                    .approveCard(cardId);

            response.sendRedirect(
                    "creditCards");

        }catch(Exception e){

            e.printStackTrace();
        }
    }
}