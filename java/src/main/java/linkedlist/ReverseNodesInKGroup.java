package linkedlist;

public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0, head);
        ListNode groupPrev = dummy;

        while (true) {
            ListNode kth = getKth(groupPrev, k);
            if (kth == null) break;

            ListNode groupNext = kth.next;

            // reversing node
            ListNode prev = kth.next;
            ListNode curr = groupPrev.next;

            while (curr != groupNext) {
                ListNode tmp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = tmp;
            }

            ListNode tmp = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = tmp;
        }

        return dummy.next;
    }

    public ListNode getKth(ListNode curr,int k) {
        while (curr != null && k > 0) {
            curr = curr.next;
            k -= 1;
        }
        return curr;
    }
    public static void main(String[] args) {
        ReverseNodesInKGroup obj = new ReverseNodesInKGroup();
        ListNode list = new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(4, new ListNode(5)))));
        obj.reverseKGroup(list, 2);
    }
}
