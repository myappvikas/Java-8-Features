package org.myapp.factory.dp;

public class PaymentFactory {
    public Payable getPaymentMethod(String type) {
        if (type == null) return null;
        switch (type.toLowerCase()) {
            case "gpay": return new GPayPayment();
            case "paytm": return new PaytmPayment();
            case "phonepay": return new PhonePayPayment();
            default: throw new IllegalArgumentException("Unsupported payment type: " + type);
        }
    }
}
