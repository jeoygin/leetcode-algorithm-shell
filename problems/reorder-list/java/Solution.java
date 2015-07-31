/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        int len = 0, i;
        ListNode cur, last, tmp, move;
        for (cur = head; cur != null; len++, cur = cur.next);
        if (len <= 2) {
        	return;
        }
        for (cur = head, i = (len + 1) / 2 - 1; i > 0; i--, cur = cur.next);
        last = cur;
    	cur = cur.next;
    	while (cur != null) {
    		tmp = cur;
    		cur = cur.next;
    		tmp.next = last.next;
    		last.next = tmp;
    	}
		move = last.next;
		last.next = null;
        for (cur = head, i = len / 2; i > 0; i--) {
        	tmp = move;
        	move = move.next;
        	tmp.next = cur.next;
        	cur.next = tmp;
        	cur = tmp.next;
        }
    }
}
