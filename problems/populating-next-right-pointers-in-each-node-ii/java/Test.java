// /**
//  * Definition for binary tree with next pointer.
//  * public class TreeLinkNode {
//  *     int val;
//  *     TreeLinkNode left, right, next;
//  *     TreeLinkNode(int x) { val = x; }
//  * }
//  */
// public class Solution {
//     public void connect(TreeLinkNode root) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<TreeLinkNode>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                TreeLinkNode root = TreeLinkNode.create(1, 2, 3, 4, 5);
                new Solution().connect(root);
                return verifyCase(casenum, TreeLinkNode.createWithNext(1, -1, 2, 2, 3, -1, 4, 4, 5, -1), root);
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
