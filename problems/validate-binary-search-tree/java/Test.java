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
//     public boolean isValidBST(TreeNode root) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Boolean>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, true, new Solution().isValidBST(TreeNode.create(2, 1 ,3)));
            }
            case 1: {
                return verifyCase(casenum, false, new Solution().isValidBST(TreeNode.create(1, -1 ,2, -1, -1, 3)));
            }
            case 2: {
                return verifyCase(casenum, true, new Solution().isValidBST(TreeNode.create(2147483647)));
            }
            case 3: {
                return verifyCase(casenum, false, new Solution().isValidBST(TreeNode.create(-2147483648, -2147483648)));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
