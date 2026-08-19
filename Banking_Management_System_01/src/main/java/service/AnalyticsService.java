package service;

import dto.ChartDataDTO;

import java.util.ArrayList;
import java.util.List;

public class AnalyticsService {

    public List<ChartDataDTO>
    getCustomerGrowth() {

        List<ChartDataDTO> list =
                new ArrayList<>();

        list.add(new ChartDataDTO("Jan",120));
        list.add(new ChartDataDTO("Feb",150));
        list.add(new ChartDataDTO("Mar",180));
        list.add(new ChartDataDTO("Apr",220));
        list.add(new ChartDataDTO("May",260));
        list.add(new ChartDataDTO("Jun",320));

        return list;
    }

    public List<ChartDataDTO>
    getMonthlyRevenue() {

        List<ChartDataDTO> list =
                new ArrayList<>();

        list.add(new ChartDataDTO("Jan",50000));
        list.add(new ChartDataDTO("Feb",70000));
        list.add(new ChartDataDTO("Mar",90000));
        list.add(new ChartDataDTO("Apr",110000));
        list.add(new ChartDataDTO("May",140000));

        return list;
    }

    public List<ChartDataDTO>
    getLoanDistribution() {

        List<ChartDataDTO> list =
                new ArrayList<>();

        list.add(new ChartDataDTO("Home Loan",45));
        list.add(new ChartDataDTO("Vehicle Loan",20));
        list.add(new ChartDataDTO("Education Loan",15));
        list.add(new ChartDataDTO("Personal Loan",20));

        return list;
    }

    public List<ChartDataDTO>
    getBranchPerformance() {

        List<ChartDataDTO> list =
                new ArrayList<>();

        list.add(new ChartDataDTO("Hyderabad",120));
        list.add(new ChartDataDTO("Bhubaneswar",80));
        list.add(new ChartDataDTO("Bangalore",150));
        list.add(new ChartDataDTO("Chennai",95));

        return list;
    }
}