package arraysandhashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI {

    /**
     * T: O(n^2) S: O(1)
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] output = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int j = 0;

            while (nums1[i] != nums2[j]) {
                j++;
            }

            int nextGreater = -1;
            while (j < nums2.length) {
                if (nums1[i] < nums2[j]){
                    nextGreater = nums2[j];
                    break;
                }
                j++;
            }
            output[i] = nextGreater;
        }

        return output;
    }

    /**
     * O (m + n)  S: O(m)
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] nextGreaterElementOptimize(int[] nums1, int[] nums2) {
        int[] output = new int[nums1.length];
        for (int i = 0; i < output.length; i++) {
            output[i] = -1;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (!map.containsKey(nums1[i])) {
                map.put(nums1[i], i);
            }
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums2.length; i++) {
            while (!stack.isEmpty() && stack.peek() < nums2[i]) {
                int key = stack.pop();
                int index = map.get(key);
                output[index] = nums2[i];
            }

            if (map.containsKey(nums2[i])) {
                stack.push(nums2[i]);
            }
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,4};
        int[] nums2 = {1,2,3,4};
        nextGreaterElementOptimize(nums1, nums2);
    }
}
