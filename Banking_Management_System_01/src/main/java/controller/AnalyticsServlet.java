package controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.AnalyticsService;
import util.JsonUtil;

import java.io.IOException;

@WebServlet("/analytics/customer")
public class AnalyticsServlet
extends HttpServlet {

    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse resp)
            throws IOException {

        resp.setContentType(
                "application/json");

        String json =
                JsonUtil.toJson(
                new AnalyticsService()
                .getCustomerGrowth());

        resp.getWriter()
                .write(json);
    }
}