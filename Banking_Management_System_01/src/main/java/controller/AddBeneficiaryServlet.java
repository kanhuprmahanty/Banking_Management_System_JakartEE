package controller;

import entity.Beneficiary;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.BeneficiaryService;

import java.io.IOException;

@WebServlet("/addBeneficiary")
public class AddBeneficiaryServlet
extends HttpServlet {

    protected void doPost(
            HttpServletRequest req,
            HttpServletResponse resp)
            throws IOException {

        Beneficiary b =
                new Beneficiary();

        b.setCustomerId(
                Long.parseLong(
                req.getParameter(
                "customerId")));

        b.setBeneficiaryName(
                req.getParameter(
                "beneficiaryName"));

        b.setAccountNumber(
                req.getParameter(
                "accountNumber"));

        b.setIfscCode(
                req.getParameter(
                "ifscCode"));

        b.setBankName(
                req.getParameter(
                "bankName"));

        b.setMobileNumber(
                req.getParameter(
                "mobileNumber"));

        new BeneficiaryService()
                .addBeneficiary(b);

        resp.sendRedirect(
                "beneficiaries");
    }
}