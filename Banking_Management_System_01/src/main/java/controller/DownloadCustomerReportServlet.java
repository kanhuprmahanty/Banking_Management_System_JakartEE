package controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import util.CustomerReportPDFUtil;

@WebServlet("/customerReport")
public class DownloadCustomerReportServlet
extends HttpServlet {

    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse resp){

        try{

            resp.setContentType(
                    "application/pdf");

            resp.setHeader(
                    "Content-Disposition",
                    "attachment; filename=CustomerReport.pdf");

            CustomerReportPDFUtil
                    .generateCustomerPDF(
                    resp.getOutputStream());

        }catch(Exception e){

            e.printStackTrace();
        }
    }
}
