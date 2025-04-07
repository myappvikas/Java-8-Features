package org.myapp.factory.dp;

public class PaymentFactory {
    public Payment getPaymentMethod(String type) {
        if (type == null) return null;

        switch (type.toLowerCase()) {
            case "creditcard": return new CreditCardPayment();
            case "paypal": return new PayPalPayment();
            case "googlepay": return new GooglePayPayment();
            default: throw new IllegalArgumentException("Unsupported payment type: " + type);
        }
    }
}
