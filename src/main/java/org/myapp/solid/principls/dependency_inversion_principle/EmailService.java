package org.myapp.solid.principls.dependency_inversion_principle;

class EmailService {
    public void sendEmail(String message) {
        System.out.println("Email sent: " + message);
    }
}

class Notification {
    private EmailService emailService;

    public Notification() {
        this.emailService = new EmailService();
    }

    public void send(String message) {
        emailService.sendEmail(message);
    }
}