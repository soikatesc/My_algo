package stacks;

import java.util.AbstractMap;
import java.util.Stack;

public class LargestRectanguleInHistPrac {
    public static int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int n = heights.length;

        Stack<AbstractMap.SimpleEntry<Integer, Integer>> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int startIndex = i;
            while (!stack.isEmpty() && heights[i] < stack.peek().getValue()) {
                AbstractMap.SimpleEntry<Integer, Integer> pair = stack.pop();
                startIndex = pair.getKey();
                int value = pair.getValue();

                maxArea = Math.max(maxArea, value * (i - startIndex) );
            }

            stack.push(new AbstractMap.SimpleEntry<>(startIndex, heights[i]));
        }

        while (!stack.isEmpty()) {
            AbstractMap.SimpleEntry<Integer, Integer> pair = stack.pop();
            maxArea = Math.max(maxArea, pair.getValue() * (n - pair.getKey()));
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] heights = { 2, 1, 5, 6, 2, 3 };
        largestRectangleArea(heights);
    }
}
