package util;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import java.io.OutputStream;

public class CustomerReportPDFUtil {

    public static void generateCustomerPDF(
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
                "Customer Report"));

        PdfPTable table =
                new PdfPTable(4);

        table.addCell("ID");
        table.addCell("Name");
        table.addCell("Email");
        table.addCell("Status");

        table.addCell("1");
        table.addCell("Kanhu");
        table.addCell("kanhu@gmail.com");
        table.addCell("ACTIVE");

        document.add(table);

        document.close();
    }
}
