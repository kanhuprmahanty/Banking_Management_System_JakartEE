package controller;

import entity.Branch;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.BranchService;

import java.io.IOException;
import java.util.List;

@WebServlet("/branches")
public class BranchListServlet
extends HttpServlet {

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException,
            IOException {

        List<Branch> branches =
                new BranchService()
                .getAllBranches();

        request.setAttribute(
                "branches",
                branches);

        request.getRequestDispatcher(
                "branch-list.jsp")
                .forward(
                request,
                response);
    }
}