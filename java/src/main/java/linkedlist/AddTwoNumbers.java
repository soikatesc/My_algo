package linkedlist;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();

        ListNode curr = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry > 0) {
            int v1 = l1 == null ? 0 : l1.val;
            int v2 = l2 == null ? 0 : l2.val;

            int sum = v1 + v2 + carry;
            ListNode newNode = new ListNode(sum % 10);

            carry = sum / 10;
            curr.next = newNode;
            curr = curr.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        AddTwoNumbers obj = new AddTwoNumbers();

        ListNode list1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode list2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        obj.addTwoNumbers(list1, list2);
    }
}