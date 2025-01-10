package org.myapp.Java_17.features.switchdemo;

public class Demo_Old {

    public static void main(String[] args) {

        String day = "Sun";

        switch(day){
            case "Sun","Sat":
                System.out.println("8AM");
                break;
            case "Mon":
                System.out.println("6AM");
                break;
            case "Tue":
                System.out.println("5AM");
                break;
            default:
                System.out.println("6:30AM");
        }
    }
}
