package service;

import dao.AuditLogDAO;
import entity.AuditLog;

import java.util.List;

public class AuditLogService {

    private AuditLogDAO dao =
            new AuditLogDAO();

    public void logActivity(
            Integer userId,
            String username,
            String role,
            String activity,
            String module,
            String ip,
            String status) {

        AuditLog log =
                new AuditLog();

        log.setUserId(userId);
        log.setUsername(username);
        log.setRole(role);
        log.setActivity(activity);
        log.setModuleName(module);
        log.setIpAddress(ip);
        log.setStatus(status);

        dao.save(log);
    }

    public List<AuditLog> getLogs() {
        return dao.getAllLogs();
    }
}