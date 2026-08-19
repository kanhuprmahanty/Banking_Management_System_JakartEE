package controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.AnalyticsService;
import util.JsonUtil;

import java.io.IOException;

@WebServlet("/analytics/branch")
public class BranchAnalyticsServlet
extends HttpServlet {

    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse resp)
            throws IOException {

        resp.setContentType(
                "application/json");

        resp.getWriter()
                .write(
                JsonUtil.toJson(
                new AnalyticsService()
                .getBranchPerformance()));
    }
}