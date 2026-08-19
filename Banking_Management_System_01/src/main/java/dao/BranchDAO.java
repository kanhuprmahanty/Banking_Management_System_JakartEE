package dao;

import entity.Branch;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class BranchDAO {

    public void save(Branch branch){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx =
                session.beginTransaction();

        session.persist(branch);

        tx.commit();
        session.close();
    }

    public void update(Branch branch){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx =
                session.beginTransaction();

        session.merge(branch);

        tx.commit();
        session.close();
    }

    public void delete(int branchId){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx =
                session.beginTransaction();

        Branch branch =
                session.get(
                Branch.class,
                branchId);

        session.remove(branch);

        tx.commit();
        session.close();
    }

    public Branch getById(int branchId){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Branch branch =
                session.get(
                Branch.class,
                branchId);

        session.close();

        return branch;
    }

    public List<Branch> getAll(){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        List<Branch> branches =
                session.createQuery(
                "FROM Branch",
                Branch.class)
                .list();

        session.close();

        return branches;
    }
}
