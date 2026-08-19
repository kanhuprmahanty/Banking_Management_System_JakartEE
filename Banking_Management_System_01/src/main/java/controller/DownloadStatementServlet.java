package controller;

import dto.StatementDTO;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import service.StatementService;
import util.PDFUtil;

import java.io.IOException;
import java.util.List;

@WebServlet("/downloadStatement")
public class DownloadStatementServlet
extends HttpServlet {

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        try {

            int accountId =
                    Integer.parseInt(
                    request.getParameter(
                    "accountId"));

            List<StatementDTO> list =
                    new StatementService()
                    .getStatementData(
                    accountId);

            response.setContentType(
                    "application/pdf");

            response.setHeader(
                    "Content-Disposition",
                    "attachment; filename=Statement.pdf");

            PDFUtil.generateStatementPDF(
                    response.getOutputStream(),
                    "KANHU MAHANTY",
                    "1234567890",
                    list);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}