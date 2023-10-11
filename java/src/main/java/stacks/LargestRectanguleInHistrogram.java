package stacks;

import java.util.AbstractMap;
import java.util.Stack;

public class LargestRectanguleInHistrogram {
    public static int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int n = heights.length;


        Stack<AbstractMap.SimpleEntry<Integer, Integer>> stack = new Stack<>();  // instead do with pairs

        for (int i = 0; i < n; i++) {
            int startIdx = i;
            while (!stack.isEmpty() && stack.peek().getValue() > heights[i]) {
                int height = stack.pop().getValue();
                int index = stack.pop().getKey();
                maxArea = Math.max(maxArea, height * (i - index));
                startIdx = index;
            }
            stack.push(new AbstractMap.SimpleEntry<>(startIdx, heights[i]));
        }

        while (!stack.isEmpty()) {
            AbstractMap.SimpleEntry<Integer, Integer> pair = stack.pop();
            int index = pair.getKey();
            int height = pair.getValue();

            maxArea = Math.max(maxArea, height * (n - index));
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = { 2,1,5,6,2,3 };
        largestRectangleArea(heights);
    }
}
