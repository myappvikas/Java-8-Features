package org.myapp.solid.principls.dependency_inversion_principle;

public class Main {
    public static void main(String[] args) {

        MessageService email = new EmailService_1();
        MessageService sms = new SMSService_1();

        Notification_1 notification1 = new Notification_1(email);
        notification1.send("Your OTP is 1234");

        Notification_1 notification2 = new Notification_1(sms);
        notification2.send("Your OTP is 5678");
    }
}
