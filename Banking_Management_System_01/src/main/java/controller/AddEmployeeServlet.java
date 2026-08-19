package controller;

import entity.Employee;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.EmployeeService;

import java.io.IOException;

@WebServlet("/addEmployee")
public class AddEmployeeServlet
extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        Employee employee =
                new Employee();

        employee.setFirstName(
                request.getParameter(
                "firstName"));

        employee.setLastName(
                request.getParameter(
                "lastName"));

        employee.setEmail(
                request.getParameter(
                "email"));

        employee.setMobile(
                request.getParameter(
                "mobile"));

        employee.setDepartment(
                request.getParameter(
                "department"));

        employee.setDesignation(
                request.getParameter(
                "designation"));

        employee.setSalary(
                Double.parseDouble(
                request.getParameter(
                "salary")));

        employee.setUsername(
                request.getParameter(
                "username"));

        employee.setPassword(
                request.getParameter(
                "password"));

        employee.setRole(
                request.getParameter(
                "role"));

        new EmployeeService()
                .addEmployee(employee);

        response.sendRedirect(
                "employees");
    }
}