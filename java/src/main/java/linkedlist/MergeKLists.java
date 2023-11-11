package linkedlist;


public class MergeKLists {

    /**
     * Method 1
     * @param lists
     * @return
     */
    public ListNode mergeKLists(ListNode[] lists) {
        int size = lists.length;
        int interval = 1;

        while (interval < size) {
            for (int i = 0; i < size - interval; i += 2 * interval) {
                MergeTwoSortedList obj = new MergeTwoSortedList();
                lists[i] = obj.mergeTwoLists(lists[i], lists[i+interval]);
            }

            interval *= 2;
        }

        return size > 0 ? lists[0] : null;
    }

    public ListNode mergeKListsUsingPointer(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        int size = lists.length;

        int i = 0;
        int last = size - 1;
        int j = last;

        while (last != 0) {
            i = 0;
            j = last;

            while (i < j) {
                MergeTwoSortedList obj = new MergeTwoSortedList();
                lists[i] = obj.mergeTwoLists(lists[i], lists[j]);
                i += 1;
                j -= 1;
                last = j;
            }
        }

        return lists[0];
    }

    public static void main(String[] args) {
        MergeKLists obj = new MergeKLists();
        ListNode list1 = new ListNode(1, new ListNode(4,
                new ListNode(5)));
        ListNode list2 = new ListNode(1, new ListNode(3,
                new ListNode(4)));
        ListNode list3 = new ListNode(2, new ListNode(6));

        ListNode[] lists = new ListNode[] {list1, list2, list3};
        // obj.mergeKLists(lists);
        obj.mergeKListsUsingPointer(lists);
    }
}
