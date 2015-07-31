// /**
//  * Definition for binary tree
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode(int x) { val = x; }
//  * }
//  */
// 
// public class BSTIterator {
// 
//     public BSTIterator(TreeNode root) {
//         
//     }
// 
//     /** @return whether we have a next smallest number */
//     public boolean hasNext() {
//         
//     }
// 
//     /** @return the next smallest number */
//     public int next() {
//         
//     }
// }
// 
// /**
//  * Your BSTIterator will be called like this:
//  * BSTIterator i = new BSTIterator(root);
//  * while (i.hasNext()) v[f()] = i.next();
//  */
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                BSTIterator i = new BSTIterator(TreeNode.create(2, 1, 3));
                int[] ret = new int[3];
                for (int idx = 0; idx < 3 && i.hasNext(); idx++) {
                    ret[idx] = i.next();
                }
                return verifyCase(casenum, new int[]{1, 2, 3}, ret);
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
