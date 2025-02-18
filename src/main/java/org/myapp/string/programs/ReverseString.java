package org.myapp.string.programs;

public class ReverseString {

    public static void main(String[] args) {

        String str = "java";

        //method_1
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reverse of given String: " + reverse);

        //method_2
        String reverse_2 = new StringBuffer("spring").reverse().toString();
        System.out.println("Reverse of given String: " + reverse_2);

        //method_3
        String reverse_3 = new StringBuilder("hibernate").reverse().toString();
        System.out.println("Reverse of given String: " + reverse_3);
    }
}
