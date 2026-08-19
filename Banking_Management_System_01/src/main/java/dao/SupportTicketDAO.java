package dao;

import entity.SupportTicket;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class SupportTicketDAO {

    public void save(SupportTicket ticket){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx =
                session.beginTransaction();

        session.persist(ticket);

        tx.commit();
        session.close();
    }

    public void update(SupportTicket ticket){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx =
                session.beginTransaction();

        session.merge(ticket);

        tx.commit();
        session.close();
    }

    public SupportTicket getById(int id){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        SupportTicket ticket =
                session.get(
                SupportTicket.class,
                id);

        session.close();

        return ticket;
    }

    public List<SupportTicket> getAll(){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        List<SupportTicket> list =
                session.createQuery(
                "FROM SupportTicket",
                SupportTicket.class)
                .list();

        session.close();

        return list;
    }
}