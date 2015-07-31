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
//     public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<List<List<Integer>>>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                List<List<Integer>> ans = new ArrayList<List<Integer>>();
                ans.add(Arrays.asList(3));
                ans.add(Arrays.asList(20, 9));
                ans.add(Arrays.asList(15, 7));
                return verifyCase(casenum, ans, new Solution().zigzagLevelOrder(TreeNode.create(3, 9, 20, -1, -1, 15, 7)));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
