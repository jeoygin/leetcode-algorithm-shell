// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode(int x) { val = x; next = null; }
//  * }
//  */
// /**
//  * Definition for binary tree
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode(int x) { val = x; }
//  * }
//  */
// public class Solution {
//     public TreeNode sortedListToBST(ListNode head) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<TreeNode>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, TreeNode.create(1), new Solution().sortedListToBST(ListNode.create(1)));
            }
            case 1: {
                return verifyCase(casenum, TreeNode.create(2, 1), new Solution().sortedListToBST(ListNode.create(1, 2)));
            }
            case 2: {
                return verifyCase(casenum, TreeNode.create(2, 1, 3), new Solution().sortedListToBST(ListNode.create(1, 2, 3)));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
