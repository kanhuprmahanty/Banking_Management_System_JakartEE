package dao;

import entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class UserDAO {

    public void save(User user){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx =
                session.beginTransaction();

        session.persist(user);

        tx.commit();

        session.close();
    }

    public User getUserByEmail(String email){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        User user =
                session.createQuery(
                "FROM User WHERE email=:email",
                User.class)
                .setParameter("email",email)
                .uniqueResult();

        session.close();

        return user;
    }
}