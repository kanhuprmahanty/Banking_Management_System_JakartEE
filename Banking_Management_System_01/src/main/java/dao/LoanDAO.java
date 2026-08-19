package dao;

import entity.Loan;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class LoanDAO {

    public void save(Loan loan){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx =
                session.beginTransaction();

        session.persist(loan);

        tx.commit();

        session.close();
    }

    public void update(Loan loan){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx =
                session.beginTransaction();

        session.merge(loan);

        tx.commit();

        session.close();
    }

    public Loan getById(int id){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Loan loan =
                session.get(Loan.class,id);

        session.close();

        return loan;
    }

    public List<Loan> getAllLoans(){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        List<Loan> loans =
                session.createQuery(
                "FROM Loan",
                Loan.class)
                .list();

        session.close();

        return loans;
    }
}