package org.myapp.Java_17.features.switchdemo;

public class Demo_New {

    public static void main(String[] args) {

        String day = "Sun";

        switch(day) {
            case "Sun", "Sat" -> System.out.println("8AM");
            case "Mon" -> System.out.println("6AM");
            case "Tue" -> System.out.println("5AM");
            default -> System.out.println("6:30AM");
        }
    }
}
