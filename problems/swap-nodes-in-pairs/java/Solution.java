public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        head = swap(head);
        ListNode cur = head.next;

        while (cur.next != null && cur.next.next != null) {
            cur.next = swap(cur.next);
            cur = cur.next.next;
        }
        
        return head;
    }

    ListNode swap(ListNode head) {
        ListNode next = head.next;
        head.next = next.next;
        next.next = head;
        return next;
    }
}
