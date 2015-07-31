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
//     public int minDepth(TreeNode root) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, 3, new Solution().minDepth(TreeNode.create(5, 4, 8, 11, -1, 13, 4, 7, 2, -1, -1, -1, 1)));
            }
            case 1: {
                return verifyCase(casenum, 2, new Solution().minDepth(TreeNode.create(1, 2)));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
