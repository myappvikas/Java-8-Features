package org.myapp.string.reverse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReverseString {

    private static final Logger log = LoggerFactory.getLogger(ReverseString.class);

    public static void main(String[] args) {

        String str = "java";

        //method1
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        log.info("Reverse of given String: " + reversed);

        //method 2
        String reversed2 = new StringBuffer("Java").reverse().toString();
        log.info("Reverse of given String: " + reversed2);

        //method3
        String reversed3 = new StringBuilder("Java").reverse().toString();
        log.info("Reverse of given String: " + reversed3);
    }
}
