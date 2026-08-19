package dao;

import entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class CustomerDAO {

    public void save(Customer customer){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx =
                session.beginTransaction();

        session.persist(customer);

        tx.commit();

        session.close();
    }

    public List<Customer> getAllCustomers(){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        List<Customer> customers =
                session.createQuery(
                "FROM Customer",
                Customer.class)
                .list();

        session.close();

        return customers;
    }

    public Customer getCustomerById(int id){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Customer customer =
                session.get(Customer.class,id);

        session.close();

        return customer;
    }

    public void update(Customer customer){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx =
                session.beginTransaction();

        session.merge(customer);

        tx.commit();

        session.close();
    }

    public void delete(int id){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx =
                session.beginTransaction();

        Customer customer =
                session.get(Customer.class,id);

        if(customer!=null){

            session.remove(customer);
        }

        tx.commit();

        session.close();
    }
}