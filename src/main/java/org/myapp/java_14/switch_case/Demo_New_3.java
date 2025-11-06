package org.myapp.java_14.switch_case;

public class Demo_New_3 {

    public static void main(String[] args) {

        String day = "Mon";
        String result = "";

        result = switch(day) {
            case "Sun", "Sat" -> "8AM";
            case "Mon" -> "6AM";
            case "Tue" -> "5AM";
            default -> "6:30AM";
        };
        System.out.println(result);

    }
}
