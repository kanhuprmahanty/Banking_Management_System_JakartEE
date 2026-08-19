package controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.BeneficiaryService;

import java.io.IOException;

@WebServlet("/verifyBeneficiary")
public class VerifyBeneficiaryServlet
extends HttpServlet {

    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse resp)
            throws IOException {

        Long id =
                Long.parseLong(
                req.getParameter("id"));

        new BeneficiaryService()
                .verifyBeneficiary(id);

        resp.sendRedirect(
                "beneficiaries");
    }
}