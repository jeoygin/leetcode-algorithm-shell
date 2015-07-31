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
//     public ListNode insertionSortList(ListNode head) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<ListNode>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, ListNode.create(1, 2, 3, 4, 5), new Solution().insertionSortList(ListNode.create(2, 4, 1, 3, 5)));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
