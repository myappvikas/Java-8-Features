package org.myapp.solid.principls.open_close_principle;

class SMSNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
