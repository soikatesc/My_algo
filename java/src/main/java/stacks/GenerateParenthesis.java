package stacks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class GenerateParenthesis {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        backtrack(result, stack, 0, 0, n);
        return  result;
    }

    public static void backtrack(List<String> result, Stack<String> stack, int openN, int closeN, int n) {
        // base case
        if (openN == closeN && openN == n) {
            Iterator vale = stack.iterator();
            String temp = "";
            while (vale.hasNext()) {
                temp = temp + vale.next();
            }
            result.add(temp);
            return;
        }

        if (openN < n) {
            stack.push("(");
            backtrack(result, stack, openN + 1, closeN, n);
            stack.pop();
        }

        if (closeN < openN) {
            stack.push(")");
            backtrack(result, stack, openN, closeN + 1, n);
            stack.pop();
        }

    }

    public static void main(String[] args) {
        generateParenthesis(3);
    }
}
