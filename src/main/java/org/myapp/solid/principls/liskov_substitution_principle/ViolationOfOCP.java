package org.myapp.solid.principls.liskov_substitution_principle;

public class ViolationOfOCP {
}
class Payment {
    public void makePayment() {
        System.out.println("Processing payment...");
    }
}

class CreditCardPayment extends Payment {
    public void makePayment() {
        System.out.println("Paid using Credit Card");
    }
}

class CashOnDelivery extends Payment {
    public void makePayment() {
        throw new UnsupportedOperationException("Cash payment cannot be processed online");
    }
}

