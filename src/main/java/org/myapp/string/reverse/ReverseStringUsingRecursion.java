package org.myapp.string.reverse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReverseStringUsingRecursion {

    private static final Logger log = LoggerFactory.getLogger(ReverseStringUsingRecursion.class);

    public static String reverse(String str) {
        // Base case: if the string is empty or has only one character
        if (str == null || str.isBlank() || str.length() == 1)
            return str;

        // Recursive case: reverse the rest of the string and add the first character at the end
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "vivek";
        String reversed = reverse(str);
        log.info("Reversed String: {}", reversed);
    }
}

