package dao;

import entity.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class EmployeeDAO {

    public void save(Employee employee){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx =
                session.beginTransaction();

        session.persist(employee);

        tx.commit();
        session.close();
    }

    public void update(Employee employee){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx =
                session.beginTransaction();

        session.merge(employee);

        tx.commit();
        session.close();
    }

    public void delete(int employeeId){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx =
                session.beginTransaction();

        Employee employee =
                session.get(
                Employee.class,
                employeeId);

        session.remove(employee);

        tx.commit();
        session.close();
    }

    public Employee getById(int employeeId){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Employee employee =
                session.get(
                Employee.class,
                employeeId);

        session.close();

        return employee;
    }

    public List<Employee> getAll(){

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        List<Employee> employees =
                session.createQuery(
                "FROM Employee",
                Employee.class)
                .list();

        session.close();

        return employees;
    }
}