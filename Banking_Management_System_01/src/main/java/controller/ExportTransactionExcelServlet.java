package controller;

import dto.ReportDTO;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.ReportService;
import util.ExcelUtil;

@WebServlet("/exportTransactionExcel")
public class ExportTransactionExcelServlet
extends HttpServlet {

    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse resp){

        try{

            resp.setContentType(
            "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");

            resp.setHeader(
            "Content-Disposition",
            "attachment; filename=Transactions.xlsx");

            ExcelUtil.exportExcel(
                    new ReportService()
                    .getTransactionReports(),
                    resp.getOutputStream());

        }catch(Exception e){

            e.printStackTrace();
        }
    }
}