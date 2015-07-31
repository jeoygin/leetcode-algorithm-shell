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
    public ListNode insertionSortList(ListNode head) {
        ListNode sentry = new ListNode(Integer.MIN_VALUE), last = sentry, cur = head, next;
        while (cur != null) {
            next = cur.next;
            if (cur.val >= last.val) {
                last.next = cur;
                last = cur;
            } else {
                ListNode insertPoint = sentry;
                while (insertPoint.next.val <= cur.val) {
                    insertPoint = insertPoint.next;
                }
                cur.next = insertPoint.next;
                insertPoint.next = cur;
            }
            cur = next;
        }
        last.next = null;
        return sentry.next;
    }
}
