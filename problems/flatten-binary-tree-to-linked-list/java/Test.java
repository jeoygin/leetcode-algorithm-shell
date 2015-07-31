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
//     public void flatten(TreeNode root) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<TreeNode>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                TreeNode node = TreeNode.create(1, 2, 5, 3, 4, -1, 6);
                new Solution().flatten(node);
                return verifyCase(casenum, TreeNode.create(1), node);
            }
            case 1: {
                TreeNode node = TreeNode.create(1, 2, -1, 3);
                new Solution().flatten(node);
                return verifyCase(casenum, TreeNode.create(1), node);
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
