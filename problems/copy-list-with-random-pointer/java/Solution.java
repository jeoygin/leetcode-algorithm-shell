/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
import java.util.*;
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode sentry = new RandomListNode(0), src = head, dst = sentry;
        while (src != null) {
            RandomListNode newNode = new RandomListNode(src.label);
            newNode.next = src.next;
            src.next = newNode;
            src = newNode.next;
        }
        src = head;
        while (src != null) {
            if (src.random != null) {
                src.next.random = src.random.next;
            }
            src = src.next.next;
        }
        src = head;
        while (src != null) {
            dst.next = src.next;
            src.next = src.next.next;
            dst = dst.next;
            src = src.next;
        }
        return sentry.next;
    }
}
