package heaps;

import javafx.util.Pair;

import java.util.PriorityQueue;
import java.util.*;

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> map = new HashMap<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);

        for (char task : tasks) {
            if (!map.containsKey(task)) {
                map.put(task, 0);
            }
            map.put(task, map.get(task) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            heap.add(entry.getValue());
        }

        int time = 0;
        Deque<Pair<Integer, Integer>> deque = new LinkedList(); // cnt, idletime

        while (!heap.isEmpty() || !deque.isEmpty()) {
            time += 1;

            if (!heap.isEmpty()) {
                int cnt = heap.poll() - 1;
                if (cnt != 0)
                    deque.add(new Pair<>(cnt, time + n));
            }

            if (!deque.isEmpty() && deque.getFirst().getValue() == time) {
                heap.add(deque.poll().getKey());
            }
        }

        return time;
    }

    public static void main(String[] args) {
        TaskScheduler obj = new TaskScheduler();

        char[] tasks = new char[]{'A','A','A','B','B'};
        obj.leastInterval(tasks, 2);
    }
}
