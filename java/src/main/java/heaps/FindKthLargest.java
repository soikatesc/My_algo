package heaps;

import java.util.PriorityQueue;

public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int num : nums) {
            maxHeap.add(num);
        }

        int res = 0;
        while (k > 0) {
            res = maxHeap.poll();
            k--;
        }

        return res;
    }

    public static void main(String[] args) {

    }
}
