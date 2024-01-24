package stacks;

import java.util.Stack;

public class ReversePolish {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {

//            if (tokens[i].equals("+")) {
//                int val1 = st.pop();
//                int val2 = st.pop();
//
//                st.push(val2 + val1);
//                continue;
//            } else if (tokens[i].equals("-")) {
//                int val1 = st.pop();
//                int val2 = st.pop();
//
//                st.push(val2 - val1);
//                continue;
//            } else if (tokens[i].equals("*")) {
//                int val1 = st.pop();
//                int val2 = st.pop();
//
//                st.push(val2 * val1);
//                continue;
//            } else if (tokens[i].equals("/")) {
//                int val1 = st.pop();
//                int val2 = st.pop();
//
//                st.push(val2 / val1);
//                continue;
//            }


            int val = Integer.parseInt(tokens[i]);
            st.push(val);
        }

        return st.peek();
    }

    public static void main(String[] args) {
        String[] tokens = {"4","13","5","/","+"};
        evalRPN(tokens);
    }
}
