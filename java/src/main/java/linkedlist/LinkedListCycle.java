package linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
            if (s == f) return true;
        }

        return false;
    }

    /**
     * T : O(n) S: O(n)
     * @param head
     * @return
     */
    public boolean hasCycleMethod2(ListNode head) {
        Set<ListNode> set = new HashSet<>();

        while(head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }

        return false;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        LinkedListCycle obj = new LinkedListCycle();
        obj.hasCycle(node1);
    }
}
