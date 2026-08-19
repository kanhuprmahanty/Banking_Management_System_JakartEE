package controller;

import entity.User;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import service.UserService;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet
extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException,
            IOException {

        String email =
                request.getParameter("email");

        String password =
                request.getParameter("password");

        UserService service =
                new UserService();

        User user =
                service.login(
                        email,
                        password);

        if(user!=null){

            HttpSession session =
                    request.getSession();

            session.setAttribute(
                    "userId",
                    user.getId());

            session.setAttribute(
                    "username",
                    user.getUsername());

            session.setAttribute(
                    "role",
                    user.getRole());

            response.sendRedirect(
                    "dashboard.jsp");
        }
        else{

            response.getWriter()
                    .println(
                    "<h2>Invalid Credentials</h2>");
        }
    }
}