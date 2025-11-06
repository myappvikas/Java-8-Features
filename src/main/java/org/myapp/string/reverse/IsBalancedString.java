package org.myapp.string.reverse;

import java.util.Stack;

public class IsBalancedString {

    public static void main(String[] args) {
        String str = "([{])}";
        System.out.println("Original String: " + str);

        if (isBalanced(str)) {
            System.out.println("The string is already balanced.");
        } else {
            System.out.println("The string is NOT balanced.");
        }
    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // For closing brackets, check match
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty(); // True if all brackets are closed
    }

    public static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
