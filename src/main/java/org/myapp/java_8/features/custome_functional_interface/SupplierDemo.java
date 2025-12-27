package org.myapp.java_8.features.custome_functional_interface;

public class SupplierDemo {

    public static void main(String[] args) {

        MySupplier<String> otpSupplier = () -> {
            int otp = (int) (Math.random() * 900000) + 100000;
            return String.valueOf(otp);
        };
        System.out.println("Generated OTP 1: " + otpSupplier.get());
        System.out.println("Generated OTP 2: " + otpSupplier.get());
        System.out.println("Generated OTP 3: " + otpSupplier.get());
    }
}

@FunctionalInterface
interface MySupplier<T> {
    T get();
}