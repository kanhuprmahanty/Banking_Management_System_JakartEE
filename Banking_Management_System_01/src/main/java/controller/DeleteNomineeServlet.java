package controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.NomineeService;

import java.io.IOException;

@WebServlet("/deleteNominee")
public class DeleteNomineeServlet
extends HttpServlet {

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        int nomineeId =
                Integer.parseInt(
                request.getParameter(
                "id"));

        new NomineeService()
                .deleteNominee(
                nomineeId);

        response.sendRedirect(
                "nominees");
    }
}