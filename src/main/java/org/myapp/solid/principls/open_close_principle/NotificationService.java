package org.myapp.solid.principls.open_close_principle;

public class NotificationService {
    public void sendNotification(Notification notification, String message) {
        notification.send(message);
    }
}
