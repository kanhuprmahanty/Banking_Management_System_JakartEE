package dao;

import entity.Account;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class AccountDAO {

    public void save(Account account){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx =
                session.beginTransaction();

        session.persist(account);

        tx.commit();

        session.close();
    }

    public List<Account> getAllAccounts(){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        List<Account> accounts =
                session.createQuery(
                "FROM Account",
                Account.class)
                .list();

        session.close();

        return accounts;
    }

    public Account getById(int id){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Account account =
                session.get(
                Account.class,id);

        session.close();

        return account;
    }

    public Account getByAccountNumber(
            String accountNumber){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Account account =
                session.createQuery(
                "FROM Account WHERE accountNumber=:acc",
                Account.class)
                .setParameter(
                "acc",
                accountNumber)
                .uniqueResult();

        session.close();

        return account;
    }

    public void update(Account account){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx =
                session.beginTransaction();

        session.merge(account);

        tx.commit();

        session.close();
    }
}
