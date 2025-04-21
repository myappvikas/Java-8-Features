package org.myapp.factory.dp;

public class Main {
    public static void main(String[] args) {

        PaymentFactory factory = new PaymentFactory();

        Payable payment_1 = factory.getPaymentMethod("gpay");
        payment_1.pay(250.0);

        Payable payment_2 = factory.getPaymentMethod("paytm");
        payment_2.pay(120.5);

        Payable payment_3 = factory.getPaymentMethod("phonepay");
        payment_3.pay(75.0);
    }
}
