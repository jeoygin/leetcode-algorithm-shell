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
//     public ListNode deleteDuplicates(ListNode head) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<ListNode>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, ListNode.create(1, 2, 5), new Solution().deleteDuplicates(ListNode.create(1, 2, 3, 3, 4, 4, 5)));
            }
            case 1: {
                return verifyCase(casenum, ListNode.create(2, 3), new Solution().deleteDuplicates(ListNode.create(1, 1, 2, 3)));
            }
            case 2: {
                return verifyCase(casenum, ListNode.create(1), new Solution().deleteDuplicates(ListNode.create(1, 2, 2)));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
