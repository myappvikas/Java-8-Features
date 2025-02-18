package org.myapp.string.programs;

public class ChangeOrder {

    public static void main(String[] args) {

        String str = "vikas kumar gupta";
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[words.length - i - 1] + " ");
        }
    }
}
