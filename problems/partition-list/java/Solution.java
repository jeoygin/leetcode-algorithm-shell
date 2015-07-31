/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode sentry = new ListNode(-1), cur = sentry, last = sentry;
        sentry.next = head;
        while (cur.next != null) {
            if (cur.next.val < x) {
                if (cur != last) {
                    ListNode toMove = cur.next;
                    cur.next = toMove.next;
                    toMove.next = last.next;
                    last.next = toMove;
                    last = toMove;
                } else {
                    cur = cur.next;
                    last = cur;
                }
            } else {
                cur = cur.next;
            }
        }
        return sentry.next;
    }
}
