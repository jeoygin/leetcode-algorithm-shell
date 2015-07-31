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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode sentry = new ListNode(0), pioneer = head, backup = sentry;
        sentry.next = head;
        while (pioneer != null) {
            if (n <= 0) {
                backup = backup.next;
            }
            pioneer = pioneer.next;
            n--;
        }
        backup.next = backup.next.next;
        return sentry.next;
    }
}
