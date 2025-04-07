package org.myapp.solid.principls.liskov_substitution_principle;

class CreditCardPayment_1 implements Payment_1 {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}
