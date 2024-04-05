package leetCodeArray;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(isValid(s));

    }

    public static boolean isValid(String s){
        int n =s.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++){
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }else if (c == ')'){
                if (!stack.isEmpty() && stack.peek() == ')'){
                    stack.pop();
                }else
                    return false;
            }else if (c == '}') {
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (c == ']') {
                if (!s.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
        }
