//package entity;
//
//import jakarta.persistence.*;
//import java.util.Date;
//
//@Entity
//@Table(name="notifications")
//public class Notification {
//
//    @Id
//    @GeneratedValue(strategy =
//    GenerationType.IDENTITY)
//
//    private int notificationId;
//
//    private String title;
//
//    private String message;
//
//    private String status;
//
//    @Temporal(
//    TemporalType.TIMESTAMP)
//
//    private Date createdDate =
//            new Date();
//
//}
package entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name="notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int notificationId;

    private String title;

    private String message;

    private String type;

    private boolean isRead;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    private int userId;

    public Notification() {
        this.createdDate = new Date();
        this.isRead = false;
    }

    public int getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
    
}
