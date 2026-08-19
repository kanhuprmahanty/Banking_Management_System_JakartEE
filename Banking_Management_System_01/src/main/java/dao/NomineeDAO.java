package dao;

import entity.Nominee;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class NomineeDAO {

    public void save(Nominee nominee){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx =
                session.beginTransaction();

        session.persist(nominee);

        tx.commit();

        session.close();
    }

    public void update(Nominee nominee){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx =
                session.beginTransaction();

        session.merge(nominee);

        tx.commit();

        session.close();
    }

    public void delete(int nomineeId){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx =
                session.beginTransaction();

        Nominee nominee =
                session.get(
                Nominee.class,
                nomineeId);

        session.remove(nominee);

        tx.commit();

        session.close();
    }

    public Nominee getById(int nomineeId){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Nominee nominee =
                session.get(
                Nominee.class,
                nomineeId);

        session.close();

        return nominee;
    }

    public List<Nominee> getAll(){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        List<Nominee> list =
                session.createQuery(
                "FROM Nominee",
                Nominee.class)
                .list();

        session.close();

        return list;
    }
}
