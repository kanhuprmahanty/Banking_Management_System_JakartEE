package dao;

import entity.Beneficiary;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class BeneficiaryDAO {

    public void save(Beneficiary beneficiary){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx =
                session.beginTransaction();

        session.persist(beneficiary);

        tx.commit();
        session.close();
    }

    public void update(Beneficiary beneficiary){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx =
                session.beginTransaction();

        session.merge(beneficiary);

        tx.commit();
        session.close();
    }

    public void delete(Long id){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx =
                session.beginTransaction();

        Beneficiary beneficiary =
                session.get(
                        Beneficiary.class,
                        id);

        if(beneficiary != null){
            session.remove(beneficiary);
        }

        tx.commit();
        session.close();
    }

    public Beneficiary getById(Long id){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Beneficiary beneficiary =
                session.get(
                        Beneficiary.class,
                        id);

        session.close();

        return beneficiary;
    }

    public List<Beneficiary> getAll(){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        List<Beneficiary> list =
                session.createQuery(
                        "FROM Beneficiary",
                        Beneficiary.class)
                        .list();

        session.close();

        return list;
    }
}