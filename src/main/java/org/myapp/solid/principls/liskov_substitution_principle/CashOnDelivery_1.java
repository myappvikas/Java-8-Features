package org.myapp.solid.principls.liskov_substitution_principle;

class CashOnDelivery_1 implements OfflinePayment {
    public void collectCash(double amount) {
        System.out.println("Collect ₹" + amount + " in cash on delivery.");
    }
}
