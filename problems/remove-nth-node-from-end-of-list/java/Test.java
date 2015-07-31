// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode(int x) {
//  *         val = x;
//  *         next = null;
//  *     }
//  * }
//  */
// public class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<ListNode>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, ListNode.create(1, 2, 3, 5), new Solution().removeNthFromEnd(ListNode.create(1, 2, 3, 4, 5), 2));
            }
            case 1: {
                return verifyCase(casenum, ListNode.create(1, 2, 3, 4), new Solution().removeNthFromEnd(ListNode.create(1, 2, 3, 4, 5), 1));
            }
            case 2: {
                return verifyCase(casenum, ListNode.create(2, 3, 4, 5), new Solution().removeNthFromEnd(ListNode.create(1, 2, 3, 4, 5), 5));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
