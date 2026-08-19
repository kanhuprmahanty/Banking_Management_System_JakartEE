package util;

import dto.ReportDTO;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.OutputStream;
import java.util.List;

public class ExcelUtil {

    public static void exportExcel(
            List<ReportDTO> reports,
            OutputStream out)
            throws Exception {

        Workbook workbook =
                new XSSFWorkbook();

        Sheet sheet =
                workbook.createSheet(
                "Reports");

        Row header =
                sheet.createRow(0);

        header.createCell(0)
                .setCellValue("ID");

        header.createCell(1)
                .setCellValue("Name");

        header.createCell(2)
                .setCellValue("Type");

        header.createCell(3)
                .setCellValue("Amount");

        header.createCell(4)
                .setCellValue("Status");

        int rowNum = 1;

        for(ReportDTO dto : reports){

            Row row =
                    sheet.createRow(
                    rowNum++);

            row.createCell(0)
                    .setCellValue(
                    dto.getId());

            row.createCell(1)
                    .setCellValue(
                    dto.getName());

            row.createCell(2)
                    .setCellValue(
                    dto.getType());

            row.createCell(3)
                    .setCellValue(
                    dto.getAmount());

            row.createCell(4)
                    .setCellValue(
                    dto.getStatus());
        }

        workbook.write(out);
        workbook.close();
    }
}