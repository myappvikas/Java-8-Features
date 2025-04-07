package org.myapp.factory.dp;

public class Main {
    public static void main(String[] args) {

        PaymentFactory factory = new PaymentFactory();

        Payment payment_1 = factory.getPaymentMethod("creditcard");
        payment_1.pay(250.0);

        Payment payment_2 = factory.getPaymentMethod("paypal");
        payment_2.pay(120.5);

        Payment payment_3 = factory.getPaymentMethod("googlepay");
        payment_3.pay(75.0);
    }
}
