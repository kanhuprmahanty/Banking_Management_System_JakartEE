package dao;

import entity.AuditLog;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class AuditLogDAO {

    public void save(AuditLog auditLog) {

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx =
                session.beginTransaction();

        session.persist(auditLog);

        tx.commit();
        session.close();
    }

    public List<AuditLog> getAllLogs() {

        Session session =
                HibernateUtil
                .getSessionFactory()
                .openSession();

        List<AuditLog> logs =
                session.createQuery(
                        "FROM AuditLog ORDER BY activityTime DESC",
                        AuditLog.class)
                        .list();

        session.close();

        return logs;
    }
}