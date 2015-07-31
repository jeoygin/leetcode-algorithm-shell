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
//     public void recoverTree(TreeNode root) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<TreeNode>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                TreeNode root = TreeNode.create(4, 2, 5, 1, 3, 6, 7);
                new Solution().recoverTree(root);
                return verifyCase(casenum, TreeNode.create(4, 2, 6, 1, 3, 5, 7), root);
            }
            case 1: {
                TreeNode root = TreeNode.create(1, 2);
                new Solution().recoverTree(root);
                return verifyCase(casenum, TreeNode.create(2, 1), root);
            }
            case 2: {
                TreeNode root = TreeNode.create(2, 3, 1);
                new Solution().recoverTree(root);
                return verifyCase(casenum, TreeNode.create(2, 1, 3), root);
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
