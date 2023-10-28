package stacks;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!stack.isEmpty() && isCloseParaen(c, stack.peek())) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

    public static boolean isCloseParaen (char c, char top) {
        if (c == ')' &&  top == '(') {
            return true;
        } else if (c == '}' && top == '{') {
            return true;
        } else if (c == ']' && top == '[') {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
    }
}
