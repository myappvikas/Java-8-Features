package org.myapp.java_14.switch_case;

public class Demo_New_2 {

    public static void main(String[] args) {

        String day = "Sun";
        String result = "";

        switch(day) {
            case "Sun", "Sat" -> result = "8AM";
            case "Mon" -> result = "6AM";
            case "Tue" -> result = "5AM";
            default -> result = "6:30AM";
        }
        System.out.println(result);
    }
}
