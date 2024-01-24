package linkedlist;

public class ReverseNodeInKGroupPrac {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode groupPrev = dummy;

        while (true) {
            ListNode kth = getKth(groupPrev, k);

            if (kth == null) break;

            ListNode groupNext = kth.next;

            ListNode curr = groupPrev.next;
            ListNode prev = groupPrev;

            while (curr != groupNext) {
                ListNode tmp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = tmp;
            }

            ListNode tmp = groupPrev.next;
            groupPrev.next = prev;
            tmp.next = groupNext;
            groupPrev = tmp;
        }

        return dummy.next;
    }

    public ListNode getKth(ListNode curr, int k) {
        while (curr != null && k > 0) {
            curr = curr.next;
            k -= 1;
        }
        return curr;
    }

    public static void main(String[] args) {
        ReverseNodeInKGroupPrac obj = new ReverseNodeInKGroupPrac();
        ListNode list = new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(4, new ListNode(5)))));
        obj.reverseKGroup(list, 2);
    }
}
