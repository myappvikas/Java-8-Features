package org.myapp.factory.dp;

public class PaytmPayment implements Payable {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Paytm.");
    }
}
