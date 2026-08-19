package util;

import dto.ReportDTO;

import java.io.PrintWriter;
import java.util.List;

public class CSVUtil {

    public static void exportCSV(
            List<ReportDTO> reports,
            PrintWriter writer){

        writer.println(
                "ID,Name,Type,Amount,Status");

        for(ReportDTO dto : reports){

            writer.println(
                    dto.getId()+","+
                    dto.getName()+","+
                    dto.getType()+","+
                    dto.getAmount()+","+
                    dto.getStatus());
        }
    }
}