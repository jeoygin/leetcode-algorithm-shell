// /**
//  * Definition for singly-linked list.
//  * class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode(int x) {
//  *         val = x;
//  *         next = null;
//  *     }
//  * }
//  */
// public class Solution {
//     public ListNode detectCycle(ListNode head) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<ListNode>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, null, new Solution().detectCycle(new ListNode(1)));
            }
            case 1: {
                return verifyCase(casenum, new ListNode(3), new Solution().detectCycle(ListNode.createWithNext(1, -1, 2, -1, 3, -1, 4, -1, 5, 2)));
            }
            case 2: {
                return verifyCase(casenum, null, new Solution().detectCycle(ListNode.create(1, 2, 3, 4, 5)));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
