package slidingwindow;

import java.util.Deque;
import java.util.LinkedList;

public class MaxSilidingWindowPrac {
    public static int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> deque = new LinkedList<>();
        int[] result = new int[nums.length - k + 1];

        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            while (!deque.isEmpty() && nums[deque.getLast()] < nums[r]) {
                deque.pollLast();
            }

            deque.add(r);

            // left index > q[0] left most value in the queue
            if (l > deque.getFirst()) {
                deque.pollFirst();
            }

            if (r + 1 >= k) {
                result[l] = nums[deque.getFirst()];
                l += 1;
            }
        }

        return result;
    }

    // [3, ]
    // [1]

    // [poolFirst, poolLast]

    public static void main(String[] args) {
//        int[] nums = {1,3,-1,-3,5,3,6,7};
//        maxSlidingWindow(nums, 3);

        int[] nums = {7, 2, 4};
        maxSlidingWindow(nums, 2);
    }
}
