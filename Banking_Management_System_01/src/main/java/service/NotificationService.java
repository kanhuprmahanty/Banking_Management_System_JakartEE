package service;

import dao.NotificationDAO;
import entity.Notification;

import java.util.List;

public class NotificationService {

    private NotificationDAO dao =
            new NotificationDAO();

    public void createNotification(
            String title,
            String message,
            String type,
            int userId){

        Notification notification =
                new Notification();

        notification.setTitle(title);
        notification.setMessage(message);
        notification.setType(type);
        notification.setUserId(userId);

        dao.save(notification);
    }

    public List<Notification>
    getNotifications(){

        return dao.getAll();
    }

    public void markAsRead(
            int id){

        Notification notification =
                dao.getById(id);

        notification.setRead(true);

        dao.update(notification);
    }
}