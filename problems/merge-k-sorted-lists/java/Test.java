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
//     public ListNode mergeKLists(List<ListNode> lists) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<ListNode>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, ListNode.create(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12), new Solution().mergeKLists(
                    Arrays.asList(
                        ListNode.create(1, 4, 7, 10), 
                        ListNode.create(2, 5, 8, 11), 
                        ListNode.create(3, 6, 9, 12))));
            }
            case 1: {
                return verifyCase(casenum, null, new Solution().mergeKLists(Collections.<ListNode>emptyList()));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
