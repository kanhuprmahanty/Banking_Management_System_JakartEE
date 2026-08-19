package dao;

import entity.CreditCard;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class CreditCardDAO {

    public void save(CreditCard card){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx =
                session.beginTransaction();

        session.persist(card);

        tx.commit();
        session.close();
    }

    public void update(CreditCard card){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx =
                session.beginTransaction();

        session.merge(card);

        tx.commit();
        session.close();
    }

    public CreditCard getById(int id){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        CreditCard card =
                session.get(
                CreditCard.class,
                id);

        session.close();

        return card;
    }

    public List<CreditCard> getAll(){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        List<CreditCard> list =
                session.createQuery(
                "FROM CreditCard",
                CreditCard.class)
                .list();

        session.close();

        return list;
    }
}