package controller;

import entity.Beneficiary;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.BeneficiaryService;

import java.io.IOException;
import java.util.List;

@WebServlet("/beneficiaries")
public class BeneficiaryListServlet
extends HttpServlet {

    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException,
            IOException {

        List<Beneficiary> list =
                new BeneficiaryService()
                .getAllBeneficiaries();

        req.setAttribute(
                "beneficiaries",
                list);

        req.getRequestDispatcher(
                "beneficiary/beneficiary-list.jsp")
                .forward(req, resp);
    }
}
