package org.myapp.solid.principls.dependency_inversion_principle;

class EmailService_1 implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}