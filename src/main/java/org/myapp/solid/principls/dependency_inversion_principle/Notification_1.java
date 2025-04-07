package org.myapp.solid.principls.dependency_inversion_principle;

class Notification_1 {
    private MessageService messageService;

    public Notification_1(MessageService messageService) {
        this.messageService = messageService;
    }

    public void send(String message) {
        messageService.sendMessage(message);
    }
}
