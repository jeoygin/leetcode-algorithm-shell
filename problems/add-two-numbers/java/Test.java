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
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<ListNode>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, ListNode.create(7, 0, 8), new Solution().addTwoNumbers(ListNode.create(2, 4, 3), ListNode.create(5, 6, 4)));
            }
            case 1: {
                return verifyCase(casenum, ListNode.create(0, 1), new Solution().addTwoNumbers(ListNode.create(5), ListNode.create(5)));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
