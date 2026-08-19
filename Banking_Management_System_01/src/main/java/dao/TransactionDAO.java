package dao;

import entity.Transaction;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

public class TransactionDAO {

    public void save(Transaction tx) {

        Session session = HibernateUtil
                .getSessionFactory()
                .openSession();

        // Hibernate Transaction
        org.hibernate.Transaction transaction =
                session.beginTransaction();

        session.persist(tx);

        transaction.commit();

        session.close();
    }

    public List<Transaction> getAllTransactions() {

        Session session = HibernateUtil
                .getSessionFactory()
                .openSession();

        List<Transaction> list =
                session.createQuery(
                        "FROM Transaction ORDER BY transactionDate DESC",
                        Transaction.class)
                        .list();

        session.close();

        return list;
    }

    public Transaction getById(Long id) {

        Session session = HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx =
                session.get(Transaction.class, id);

        session.close();

        return tx;
    }

    public void update(Transaction tx) {

        Session session = HibernateUtil
                .getSessionFactory()
                .openSession();

        org.hibernate.Transaction transaction =
                session.beginTransaction();

        session.merge(tx);

        transaction.commit();

        session.close();
    }

    public void delete(Long id) {

        Session session = HibernateUtil
                .getSessionFactory()
                .openSession();

        org.hibernate.Transaction transaction =
                session.beginTransaction();

        Transaction tx =
                session.get(Transaction.class, id);

        if (tx != null) {
            session.remove(tx);
        }

        transaction.commit();

        session.close();
    }
}