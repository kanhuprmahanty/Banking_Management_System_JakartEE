package controller;

import entity.Employee;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.EmployeeService;

import java.io.IOException;
import java.util.List;

@WebServlet("/employees")
public class EmployeeListServlet
extends HttpServlet {

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException,
            IOException {

        List<Employee> employees =
                new EmployeeService()
                .getAllEmployees();

        request.setAttribute(
                "employees",
                employees);

        request.getRequestDispatcher(
                "employee-list.jsp")
                .forward(
                request,
                response);
    }
}