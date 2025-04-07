package org.myapp.solid.principls.liskov_substitution_principle;

public class LSPDemo {
    public static void main(String[] args) {
        // Online payment
        Payment_1 payment = new CreditCardPayment_1(); // ✅ Substitutable
        payment.pay(500.0);

        // Offline payment
        OfflinePayment cod = new CashOnDelivery_1();
        cod.collectCash(1000.0);
    }
}