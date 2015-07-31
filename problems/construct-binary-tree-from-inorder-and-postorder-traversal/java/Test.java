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
//     public TreeNode buildTree(int[] inorder, int[] postorder) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<TreeNode>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, TreeNode.create(2, 1, 3), new Solution().buildTree(new int[]{1, 2, 3}, new int[] {1, 3, 2}));
            }
            case 1: {
                return verifyCase(casenum, TreeNode.create(1, 2), new Solution().buildTree(new int[]{2, 1}, new int[] {2, 1}));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
