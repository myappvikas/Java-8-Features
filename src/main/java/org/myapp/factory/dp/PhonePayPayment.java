package org.myapp.factory.dp;

public class PhonePayPayment implements Payable {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Phone pay.");
    }
}
