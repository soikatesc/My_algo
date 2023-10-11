package stacks;

import java.util.Stack;

public class DailyTemperaturePrac {
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] output = new int[temperatures.length];

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int index = stack.pop();
                output[index] = i - index;
            }

            stack.push(i);
        }

        return output;
    }

    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        dailyTemperatures(temperatures);
    }
}
