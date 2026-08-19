package controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import util.LoanReportPDFUtil;

@WebServlet("/loanReport")
public class DownloadLoanReportServlet
extends HttpServlet {

    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse resp){

        try{

            resp.setContentType(
                    "application/pdf");

            resp.setHeader(
                    "Content-Disposition",
                    "attachment; filename=LoanReport.pdf");

            LoanReportPDFUtil
                    .generateLoanPDF(
                    resp.getOutputStream());

        }catch(Exception e){

            e.printStackTrace();
        }
    }
}