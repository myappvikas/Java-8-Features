package org.myapp.string.reverse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerDemo {

    private static final Logger log = LoggerFactory.getLogger(ScannerDemo.class);
    public static void main(String[] args) {

        String message = scannerDemoUsingInt();
        log.info(message);

        String reverseString = scannerDemoUsingString();
        log.info("Reverse String: "+reverseString);
    }

    private static String scannerDemoUsingInt() {
        Scanner scanner = new Scanner(System.in);
        log.info("Enter a number");
        int number = scanner.nextInt();
        if (number % 2 == 0)
            return "Even number";
        else
            return "Odd number";
    }

    private static String scannerDemoUsingString() {
        Scanner scanner = new Scanner(System.in);
        log.info("Enter a String");
        String str = scanner.nextLine();
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
