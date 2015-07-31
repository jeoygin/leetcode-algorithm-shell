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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode sentry = new ListNode(0), before = sentry, first = new ListNode(0), last = null, cur = sentry;
        sentry.next = head;
        for (int i = 1; cur.next != null && i <= n; i++) {
            if (i >= m) {
                if (i == m) {
                    before = cur;
                    last = cur.next;
                }
                ListNode next = cur.next;
                cur.next = next.next;
                next.next = first.next;
                first.next = next;
            } else {
                cur = cur.next;
            }
        }
        last.next = before.next;
        before.next = first.next;
        return sentry.next;
    }
}
