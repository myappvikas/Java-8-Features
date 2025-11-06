package org.myapp.string.reverse;

import java.util.Stack;

public class PrintBalancedString {
    public static void main(String[] args) {

        String str = "([{])}";
        System.out.println("Original String: " + str);

        String balanced = balanceBrackets(str);
        System.out.println("Balanced String: " + balanced);
    }

    public static String balanceBrackets(String str) {

        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                result.append(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (!stack.isEmpty() && isMatchingPair(stack.peek(), ch)) {
                    stack.pop();
                    result.append(ch);
                } else {
                    // Ignore unmatched closing bracket
                    // Optionally: You could insert matching opening bracket instead
                }
            }
        }

        // Add missing closing brackets
        while (!stack.isEmpty()) {
            char open = stack.pop();
            result.append(getClosingFor(open));
        }

        return result.toString();
    }

    public static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    public static char getClosingFor(char open) {
        switch (open) {
            case '(': return ')';
            case '{': return '}';
            case '[': return ']';
            default: return ' ';
        }
    }
}
