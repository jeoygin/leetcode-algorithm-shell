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
    public ListNode rotateRight(ListNode head, int n) {
        ListNode last = head, cur = head, newHead = head, tail;
        int len = head != null ? 1 : 0;
        for (tail = head; tail != null && tail.next != null; tail = tail.next, len++);
        if (len > 0) {
            n %= len;
        }
        for (int i = 0; i < len - n - 1; i++) {
            last = last.next;
        }
        if (last != null && last.next != null) {
            newHead = last.next;
            last.next = null;
            tail.next = head;
        }
        return newHead;
    }
}
