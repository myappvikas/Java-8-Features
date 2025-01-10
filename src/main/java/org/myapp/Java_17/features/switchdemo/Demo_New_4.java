package org.myapp.Java_17.features.switchdemo;

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
