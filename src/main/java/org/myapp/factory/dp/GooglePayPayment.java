package org.myapp.factory.dp;

public class GooglePayPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Google Pay.");
    }
}
