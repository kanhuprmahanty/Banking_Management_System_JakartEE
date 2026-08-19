package controller;

import dto.ReportDTO;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.ReportService;
import util.CSVUtil;

@WebServlet("/exportCustomerCSV")
public class ExportCustomerCSVServlet
extends HttpServlet {

    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse resp){

        try{

            resp.setContentType(
                    "text/csv");

            resp.setHeader(
                    "Content-Disposition",
                    "attachment; filename=Customers.csv");

            CSVUtil.exportCSV(
                    new ReportService()
                    .getCustomerReports(),
                    resp.getWriter());

        }catch(Exception e){

            e.printStackTrace();
        }
    }
}