package org.myapp.java_14.switch_case;

/*
In Java, the **yield** keyword is used within a switch expression
to return a value from a case block. This feature was introduced
in Java 14 as part of enhanced switch expressions, and it makes
switch expressions more expressive and concise.
 */
public class Demo_New_4 {

    public static void main(String[] args) {

        String day = "Thu";
        String result = "";

        result = switch(day) {
            case "Sun", "Sat" : yield  "8AM";
            case "Mon" : yield "6AM";
            case "Tue" : yield  "5AM";
            default : yield "6:30AM";
        };
        System.out.println(result);
    }
}
