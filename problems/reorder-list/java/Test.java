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
//     public void reorderList(ListNode head) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<ListNode>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                ListNode head = ListNode.create(1, 2, 3, 4);
                new Solution().reorderList(head);
                return verifyCase(casenum, ListNode.create(1, 4, 2, 3), head);
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
