package linkedlist;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    int capacity = 0;
    Map<Integer, Node> cache = new HashMap<>();

    Node left;
    Node right;

    class Node {
        int key;
        int val;
        Node prev = null;
        Node next = null;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.left = new Node(0, 0);
        this.right = new Node(0, 0);

        // left = LRU right = most recent
        this.left.next = this.right;
        this.right.prev = this.left;

    }

    public void remove(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    public void insert(Node node) {
        Node prev = this.right.prev;
        Node next = this.right;

        prev.next = node;
        next.prev = node;

        node.next = next;
        node.prev = prev;
    }

    public int get(int key) {
        if (this.cache.containsKey(key)) {
            this.remove(this.cache.get(key));
            this.insert(this.cache.get(key));
            return this.cache.get(key).val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (this.cache.containsKey(key)) {
            this.remove(this.cache.get(key));
        }

        this.cache.put(key, new Node(key, value));
        this.insert(this.cache.get(key));

        if (cache.size() > this.capacity) {
            // remove and delete LSU
            Node lru = this.left.next;
            this.remove(lru);
            cache.remove(lru.key);
        }
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);
        cache.put(3, 3);
        cache.get(2);
        cache.put(4, 4);
        cache.get(1);
        cache.get(3);
    }
}
