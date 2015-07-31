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
    public ListNode mergeKLists(List<ListNode> lists) {
        ListNode sentry = new ListNode(0), cur, next;
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(Math.max(lists.size(), 1), new Comparator<ListNode>(){
            public int compare(ListNode node1, ListNode node2) {
                return Integer.compare(node1.val, node2.val);
            }
        });
        for (ListNode node : lists) {
            if (node != null) {
                queue.offer(node);    
            }
        }
        for (cur = sentry; !queue.isEmpty(); cur = cur.next) {
        	next = queue.peek().next;
            cur.next = queue.poll();
            if (next != null) {
                queue.offer(next);
            }
        }
        return sentry.next;
    }
}
