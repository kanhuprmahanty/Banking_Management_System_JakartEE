package controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.ReportService;
import util.CSVUtil;

@WebServlet("/exportTransactionCSV")
public class ExportTransactionCSVServlet
extends HttpServlet {

    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse resp){

        try{

            resp.setContentType(
                    "text/csv");

            resp.setHeader(
                    "Content-Disposition",
                    "attachment; filename=Transactions.csv");

            CSVUtil.exportCSV(
                    new ReportService()
                    .getTransactionReports(),
                    resp.getWriter());

        }catch(Exception e){

            e.printStackTrace();
        }
    }
}