package controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.BranchService;

import java.io.IOException;

@WebServlet("/deleteBranch")
public class DeleteBranchServlet
extends HttpServlet {

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        int branchId =
                Integer.parseInt(
                request.getParameter(
                "id"));

        new BranchService()
                .deleteBranch(
                branchId);

        response.sendRedirect(
                "branches");
    }
}