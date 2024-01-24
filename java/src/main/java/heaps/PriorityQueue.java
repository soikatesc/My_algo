package heaps;

import java.util.ArrayList;
import java.util.List;

public class PriorityQueue {

    private List<Integer> heap = new ArrayList<>();

    // size
    public int size() {
        return heap.size();
    }

    // isEmpty
    public boolean isEmpty() {
        return size() == 0;
    }

    // push
    public int push(int val) {
        // push the value end of the array
        heap.add(val);

        shiftUp();

       return size();
    }

    private void shiftUp() {
        int nodeIdx = size() - 1;
        int parentIdx = (int) Math.floor((nodeIdx - 1) / 2);

        while (nodeIdx > 0 && heap.get(nodeIdx) > heap.get(parentIdx)) {
            // swap
            swap(nodeIdx, parentIdx);

            nodeIdx = parentIdx;
            parentIdx = (int) Math.floor((nodeIdx - 1) / 2);
        }
    }

    public int peek() {
        return heap.get(0);
    }

    // pop
    public int pop() {
        if (this.size() > 1) {
            swap(0, size() - 1);
        }
        int val = heap.remove(size() - 1);
        shiftDown();
        return val;
    }

    // [20, 45, 25, 40, 35, 10, 15, 50]
    // [20, 45, 25, 40, 35, 10, 15]
    //   0    1   2   3   4   5   6
    private void shiftDown() {
        int nodeIdx = 0;
        int leftChildIdx = getLeft(nodeIdx);
        int rightChildIdx = getRight(nodeIdx);

        while ((leftChildIdx < size() && heap.get(leftChildIdx) > heap.get(nodeIdx))
                || (rightChildIdx < size() && heap.get(rightChildIdx) > heap.get(nodeIdx))) {
            // greater node index and right child always bigger so need to add the check
            int greaterNodeIdx = rightChildIdx < heap.size() &&
                    heap.get(leftChildIdx) > heap.get(rightChildIdx) ? leftChildIdx : rightChildIdx;

            swap(greaterNodeIdx, nodeIdx);

            nodeIdx = greaterNodeIdx;

            leftChildIdx = getLeft(nodeIdx);
            rightChildIdx = getRight(nodeIdx);
        }
    }

    private int getLeft(int nodeIdx) {
        int leftIdx = (nodeIdx * 2) + 1;
        return leftIdx;
    }

    private int getRight(int nodeIdx) {
        int rightIdx = (nodeIdx * 2) + 2;
        return rightIdx;
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.push(50);
        priorityQueue.push(45);
        priorityQueue.push(25);
        priorityQueue.push(40);
        priorityQueue.push(35);
        priorityQueue.push(10);
        priorityQueue.push(15);
        priorityQueue.push(20);
        System.out.println(priorityQueue.size());

        priorityQueue.push(75);

        System.out.println(priorityQueue.size());

        System.out.println(priorityQueue.pop());
    }
}
