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
//     public List<List<Integer>> pathSum(TreeNode root, int sum) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<List<List<Integer>>>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                List<List<Integer>> ans = new ArrayList<List<Integer>>();
                ans.add(Arrays.asList(5, 4, 11, 2));
                ans.add(Arrays.asList(5, 8, 4, 5));
                return verifyCase(casenum, ans, new Solution().pathSum(TreeNode.create(5, 4, 8, 11, -1, 13, 4, 7, 2, -1, -1, -1, -1, 5, 1), 22));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
