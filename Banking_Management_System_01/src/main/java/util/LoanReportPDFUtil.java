package util;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import java.io.OutputStream;

public class LoanReportPDFUtil {

    public static void generateLoanPDF(
            OutputStream out)
            throws Exception {

        Document document =
                new Document();

        PdfWriter.getInstance(
                document,
                out);

        document.open();

        document.add(
                new Paragraph(
                "Loan Report"));

        PdfPTable table =
                new PdfPTable(4);

        table.addCell("Loan ID");
        table.addCell("Customer");
        table.addCell("Amount");
        table.addCell("Status");

        table.addCell("LN1001");
        table.addCell("Kanhu");
        table.addCell("500000");
        table.addCell("APPROVED");

        document.add(table);

        document.close();
    }
}