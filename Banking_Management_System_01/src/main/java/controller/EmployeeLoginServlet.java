package controller;

import entity.Employee;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/employeeLogin")
public class EmployeeLoginServlet
extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response){

        String username =
                request.getParameter(
                "username");

        String password =
                request.getParameter(
                "password");

        // Validate Employee

        HttpSession session =
                request.getSession();

        session.setAttribute(
                "employee",
                username);
    }
}