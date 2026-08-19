package util;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import dto.StatementDTO;

import java.io.OutputStream;
import java.util.List;

public class PDFUtil {

    public static void generateStatementPDF(
            OutputStream outputStream,
            String customerName,
            String accountNumber,
            List<StatementDTO> statements)
            throws Exception {

        Document document =
                new Document();

        PdfWriter.getInstance(
                document,
                outputStream);

        document.open();

        Font titleFont =
                FontFactory.getFont(
                FontFactory.HELVETICA_BOLD,
                18);

        Paragraph title =
                new Paragraph(
                "BANK ACCOUNT STATEMENT",
                titleFont);

        title.setAlignment(
                Element.ALIGN_CENTER);

        document.add(title);

        document.add(
                new Paragraph(" "));

        document.add(
                new Paragraph(
                "Customer Name : "
                + customerName));

        document.add(
                new Paragraph(
                "Account Number : "
                + accountNumber));

        document.add(
                new Paragraph(
                "Generated On : "
                + new java.util.Date()));

        document.add(
                new Paragraph(" "));

        PdfPTable table =
                new PdfPTable(5);

        table.setWidthPercentage(100);

        table.addCell(
                "Transaction ID");

        table.addCell(
                "Type");

        table.addCell(
                "Amount");

        table.addCell(
                "Balance");

        table.addCell(
                "Date");

        for(StatementDTO dto : statements){

            table.addCell(
                    dto.getTransactionId());

            table.addCell(
                    dto.getTransactionType());

            table.addCell(
                    String.valueOf(
                    dto.getAmount()));

            table.addCell(
                    String.valueOf(
                    dto.getBalance()));

            table.addCell(
                    dto.getTransactionDate()
                    .toString());
        }

        document.add(table);

        document.close();
    }
}