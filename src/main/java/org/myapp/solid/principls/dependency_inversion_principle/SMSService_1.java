package org.myapp.solid.principls.dependency_inversion_principle;

class SMSService_1 implements MessageService {
    public void sendMessage(String message) {
        System.out.println("SMS sent: " + message);
    }
}