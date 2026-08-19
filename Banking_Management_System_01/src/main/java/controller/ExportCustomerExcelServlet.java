package controller;

import dto.ReportDTO;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.ReportService;
import util.ExcelUtil;

import java.util.List;

@WebServlet("/exportCustomerExcel")
public class ExportCustomerExcelServlet
extends HttpServlet {

    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse resp){

        try{

            List<ReportDTO> reports =
                    new ReportService()
                    .getCustomerReports();

            resp.setContentType(
            "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");

            resp.setHeader(
            "Content-Disposition",
            "attachment; filename=Customers.xlsx");

            ExcelUtil.exportExcel(
                    reports,
                    resp.getOutputStream());

        }catch(Exception e){

            e.printStackTrace();
        }
    }
}