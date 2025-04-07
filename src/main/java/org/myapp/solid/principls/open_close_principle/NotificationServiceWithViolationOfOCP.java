package org.myapp.solid.principls.open_close_principle;

public class NotificationServiceWithViolationOfOCP{

    public void sendNotification(String type, String message) {
        if (type.equals("EMAIL")) {
            System.out.println("Sending EMAIL: " + message);
        } else if (type.equals("SMS")) {
            System.out.println("Sending SMS: " + message);
        }
    }
}
