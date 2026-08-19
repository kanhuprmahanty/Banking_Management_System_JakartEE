package dao;

import entity.Notification;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class NotificationDAO {

    public void save(Notification notification){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx =
                session.beginTransaction();

        session.persist(notification);

        tx.commit();
        session.close();
    }

    public void update(Notification notification){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx =
                session.beginTransaction();

        session.merge(notification);

        tx.commit();
        session.close();
    }

    public Notification getById(int id){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Notification notification =
                session.get(
                Notification.class,
                id);

        session.close();

        return notification;
    }

    public List<Notification> getAll(){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        List<Notification> list =
                session.createQuery(
                "FROM Notification ORDER BY createdDate DESC",
                Notification.class)
                .list();

        session.close();

        return list;
    }
}