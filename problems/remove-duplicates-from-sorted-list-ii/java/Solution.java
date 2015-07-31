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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode root = new ListNode(0), last = root, cur = head;
        while (cur != null) {
        	if (cur.next == null || cur.next.val != cur.val) {
        		last.next = cur;
        		last = cur;
        	} else {
        		while (cur.next != null && cur.next.val == cur.val) {
        			cur = cur.next;
        		}
        	}
        	cur = cur.next;
        }
        last.next = null;
        return root.next;
    }
}
