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
    public ListNode sortList(ListNode head) {
        int len = 0, i;
        ListNode cur, left, right, merge;
        for (cur = head; cur != null; len++, cur = cur.next);
        if (len <= 1) {
        	return head;
        }
        for (cur = head, i = len / 2 - 1; i > 0; cur = cur.next, i--);
        right = sortList(cur.next);
    	cur.next = null;
    	left = sortList(head);

    	head = cur = null;
    	while (left != null || right != null) {
    		if (right == null || left != null && left.val <= right.val) {
    			merge = left;
    			left = left.next;
    		} else {
    			merge = right;
    			right = right.next;
    		}
    		if (head == null) {
    			head = cur = merge;
    		} else {
    			cur.next = merge;
    			cur = merge;
    		}
    	}
    	return head;
    }
}
