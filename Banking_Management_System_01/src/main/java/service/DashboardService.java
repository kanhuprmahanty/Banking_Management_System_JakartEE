package service;

import dao.DashboardDAO;
import dto.DashboardDTO;

public class DashboardService {

    private DashboardDAO dao =
            new DashboardDAO();

    public DashboardDTO getDashboardData() {

        return dao.getDashboardData();
    }
}