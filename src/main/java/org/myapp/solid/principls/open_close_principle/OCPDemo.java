package org.myapp.solid.principls.open_close_principle;

public class OCPDemo {

    public static void main(String[] args) {

        NotificationService service = new NotificationService();

        service.sendNotification(new EmailNotification(), "Hello via Email!");
        service.sendNotification(new SMSNotification(), "Hello via SMS!");
    }
}
