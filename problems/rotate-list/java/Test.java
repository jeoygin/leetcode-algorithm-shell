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
//     public ListNode rotateRight(ListNode head, int n) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<ListNode>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, ListNode.create(4, 5, 1, 2, 3), new Solution().rotateRight(ListNode.create(1, 2, 3, 4, 5), 2));
            }
            case 1: {
                return verifyCase(casenum, ListNode.create(1, 2), new Solution().rotateRight(ListNode.create(1, 2), 0));
            }
            case 2: {
                return verifyCase(casenum, ListNode.create(1, 2), new Solution().rotateRight(ListNode.create(1, 2), 2));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
