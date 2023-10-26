package linkedlist;

import java.util.HashMap;

public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> oldToCopy = new HashMap<>();

        Node cur = head;
        while (cur != null) {
            Node copy = new Node(cur.val);
            oldToCopy.put(cur, copy);
            cur = cur.next;
        }

        cur = head;

        while (cur != null) {
            Node copy = oldToCopy.get(cur);
            copy.next = oldToCopy.get(cur.next);
            copy.random = oldToCopy.get(cur.random);

            cur = cur.next;
        }

        return oldToCopy.get(head);
    }

    public static void main(String[] args) {
        CopyListWithRandomPointer obj = new CopyListWithRandomPointer();

        Node node1 = new Node(7);
        Node node2 = new Node(13);
        Node node3 = new Node(11);
        Node node4 = new Node(10);
        Node node5 = new Node(1);

        node1.next = node2;
        node1.random = null;

        node2.next = node3;
        node2.random = node1;

        node3.next = node4;
        node3.random = node5;

        node4.next = node5;
        node4.random = node3;

        node5.next = null;
        node5.random = node1;

        obj.copyRandomList(node1);
    }
}
