package org.myapp.factory.dp;

public class GPayPayment implements Payable {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Google Pay.");
    }
}
