// /**
//  * Definition for binary tree
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode(int x) { val = x; left = null; right = null; }
//  * }
//  */
// public class Solution {
//     public List<TreeNode> generateTrees(int n) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<List<TreeNode>>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                List<TreeNode> ret = new ArrayList<TreeNode>();
                ret.add(TreeNode.create(1, -1, 2, -1, -1, -1, 3));
                ret.add(TreeNode.create(1, -1, 3, -1, -1, 2, -1));
                ret.add(TreeNode.create(2, 1, 3));
                ret.add(TreeNode.create(3, 1, -1, -1, 2));
                ret.add(TreeNode.create(3, 2, -1, 1));
                return verifyCase(casenum, ret, new Solution().generateTrees(3));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
