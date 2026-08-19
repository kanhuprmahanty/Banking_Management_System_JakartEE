package service;

import dto.StatementDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StatementService {

    public List<StatementDTO>
    getStatementData(
            int accountId){

        List<StatementDTO> list =
                new ArrayList<>();

        StatementDTO dto =
                new StatementDTO();

        dto.setTransactionId(
                "TXN10001");

        dto.setTransactionType(
                "DEPOSIT");

        dto.setAmount(
                5000);

        dto.setBalance(
                25000);

        dto.setTransactionDate(
                new Date());

        list.add(dto);

        return list;
    }
}
