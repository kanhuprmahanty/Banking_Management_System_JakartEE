package service;

import dto.ReportDTO;

import java.util.ArrayList;
import java.util.List;

public class ReportService {

    public List<ReportDTO> getCustomerReports() {

        List<ReportDTO> list =
                new ArrayList<>();

        ReportDTO dto =
                new ReportDTO();

        dto.setId("C001");
        dto.setName("Kanhu");
        dto.setType("Customer");
        dto.setAmount(50000);
        dto.setStatus("ACTIVE");

        list.add(dto);

        return list;
    }

    public List<ReportDTO>
    getTransactionReports() {

        List<ReportDTO> list =
                new ArrayList<>();

        ReportDTO dto =
                new ReportDTO();

        dto.setId("TXN1001");
        dto.setName("Deposit");
        dto.setType("Transaction");
        dto.setAmount(15000);
        dto.setStatus("SUCCESS");

        list.add(dto);

        return list;
    }
}