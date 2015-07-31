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
import java.util.*;
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode sentry = new ListNode(0), last = sentry, cur, next;
        LinkedList<ListNode> stack = new LinkedList<ListNode>();
        sentry.next = head;
        while (true) {
            cur = last;
            for (int i = 0; i < k && cur != null; i++, cur = cur.next) {
                stack.push(cur.next);
            }
            if (cur == null) {
                break;
            }
            next = cur.next;
            while (!stack.isEmpty()) {
                last.next = stack.pop();
                last = last.next;
            }
            last.next = next;
        }
        return sentry.next;
    }
}
