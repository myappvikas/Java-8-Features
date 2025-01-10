package org.myapp.java_11.features.string;

public class String_method_2 {

    public static void main(String[] args) {

        String str = "   Hello, Java 11!   ";
        String unicodeWhitespaceStr = "\u2002\u2003Hello\u2002\u2003"; // Contains Unicode whitespace characters

        System.out.println("Original string: '" + str + "'");
        System.out.println("strip(): '" + str.strip() + "'");           // Removes both leading and trailing whitespace
        System.out.println("stripLeading(): '" + str.stripLeading() + "'"); // Removes leading whitespace only
        System.out.println("stripTrailing(): '" + str.stripTrailing() + "'"); // Removes trailing whitespace only

        System.out.println("Original Unicode string: '" + unicodeWhitespaceStr + "'");
        System.out.println("strip() on Unicode: '" + unicodeWhitespaceStr.strip() + "'"); // Removes Unicode whitespace
    }
}
