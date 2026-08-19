package dto;

public class NotificationDTO {

    private String title;
    private String message;
    private String type;

    public NotificationDTO() {}

    public NotificationDTO(
            String title,
            String message,
            String type){

        this.title = title;
        this.message = message;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public String getType() {
        return type;
    }
}