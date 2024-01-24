package slidingwindow;

import java.util.Deque;
import java.util.LinkedList;

public class MaxSlidingWindow {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        int l = 0;
        Deque<Integer> queue = new LinkedList<>();

        for (int r = 0; r < nums.length; r++) {
            if (!queue.isEmpty() && queue.peekFirst() < r - k + 1) {
                queue.pollFirst();
            }

            while (!queue.isEmpty() && nums[r] > nums[queue.peekLast()]) queue.pollLast();

            queue.offer(r);

            if (r >= k - 1) ans[l++] = nums[queue.peekFirst()];

        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        maxSlidingWindow(nums, k);
    }
}
