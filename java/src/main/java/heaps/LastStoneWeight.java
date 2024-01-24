package heaps;

import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int n : stones) {
            maxHeap.add(n);
        }

        if (maxHeap.size() == 1) return maxHeap.peek();

        while (maxHeap.size() > 1) {
            int s1 = maxHeap.poll();
            int s2 = maxHeap.poll();

            int diff = Math.abs(s1 - s2);

            if (diff > 0) {
                maxHeap.add(diff);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }

    public static void main(String[] args) {
        LastStoneWeight lastStoneWeight = new LastStoneWeight();
        // lastStoneWeight.lastStoneWeight(new int[]{2,7,4,1,8,1});
        lastStoneWeight.lastStoneWeight(new int[]{2,2});
    }
}