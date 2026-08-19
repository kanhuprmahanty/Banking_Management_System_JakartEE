package controller;

import entity.Branch;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.BranchService;
import util.IFSCGenerator;

import java.io.IOException;

@WebServlet("/addBranch")
public class AddBranchServlet
extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        Branch branch =
                new Branch();

        branch.setBranchName(
                request.getParameter(
                "branchName"));

        branch.setManagerName(
                request.getParameter(
                "managerName"));

        branch.setEmail(
                request.getParameter(
                "email"));

        branch.setPhone(
                request.getParameter(
                "phone"));

        branch.setAddress(
                request.getParameter(
                "address"));

        branch.setCity(
                request.getParameter(
                "city"));

        branch.setState(
                request.getParameter(
                "state"));

        String code =
                request.getParameter(
                "branchCode");

        branch.setIfscCode(
                IFSCGenerator
                .generateIFSC(code));

        new BranchService()
                .addBranch(branch);

        response.sendRedirect(
                "branches");
    }
}