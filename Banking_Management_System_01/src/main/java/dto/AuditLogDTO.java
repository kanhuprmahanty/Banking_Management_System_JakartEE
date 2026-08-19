package dto;

public class AuditLogDTO {

    private String username;
    private String role;
    private String activity;
    private String moduleName;
    private String status;

    public AuditLogDTO() {
    }

    public AuditLogDTO(
            String username,
            String role,
            String activity,
            String moduleName,
            String status) {

        this.username = username;
        this.role = role;
        this.activity = activity;
        this.moduleName = moduleName;
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }

    public String getActivity() {
        return activity;
    }

    public String getModuleName() {
        return moduleName;
    }

    public String getStatus() {
        return status;
    }
}