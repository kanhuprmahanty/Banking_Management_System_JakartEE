package dao;

import dto.DashboardDTO;
import org.hibernate.Session;
import util.HibernateUtil;

public class DashboardDAO {

    public DashboardDTO getDashboardData() {

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        DashboardDTO dto =
                new DashboardDTO();

        dto.setTotalCustomers(
                (Long) session.createQuery(
                        "select count(c) from Customer c")
                        .uniqueResult());

        dto.setTotalAccounts(
                (Long) session.createQuery(
                        "select count(a) from Account a")
                        .uniqueResult());

        dto.setTotalLoans(
                (Long) session.createQuery(
                        "select count(l) from Loan l")
                        .uniqueResult());

        dto.setTotalTransactions(
                (Long) session.createQuery(
                        "select count(t) from Transaction t")
                        .uniqueResult());

        session.close();

        return dto;
    }
}