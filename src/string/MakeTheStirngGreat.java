package string;

import java.util.Stack;

public class MakeTheStirngGreat {

    public static void main(String[] args) {

    }

    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c) || stack.isEmpty() || c != Character.toUpperCase(stack.peek())) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {

            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}
