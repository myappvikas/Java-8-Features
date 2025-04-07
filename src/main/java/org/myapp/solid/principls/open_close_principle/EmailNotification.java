package org.myapp.solid.principls.open_close_principle;

class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}
