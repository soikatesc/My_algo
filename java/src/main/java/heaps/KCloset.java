package heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KCloset {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> (a[0] * a[0] + a[1] * a[1]))
        );

        int[][] result = new int[k][2];

        for (int[] item : points) {
            minHeap.add(item);
        }

        for (int i = 0; i < k; i++) {
            int[] curr = minHeap.poll();
            result[i][0] = curr[0];
            result[i][1] = curr[1];
        }

        return result;
    }

    public static void main(String[] args) {
        KCloset obj = new KCloset();
        obj.kClosest(
                new int[][]{{1, 3},{-2,2}},
                1
        );
    }
}
