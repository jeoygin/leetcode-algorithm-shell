/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();
        List<TreeNode> prev = new ArrayList<TreeNode>(), cur;
        if (root != null) {
            prev.add(root);
        }
        while (prev.size() > 0) {
            List<Integer> valList = new ArrayList<Integer>();
            cur = new ArrayList<TreeNode>();
            for (TreeNode node: prev) {
                valList.add(node.val);
                if (node.left != null) {
                    cur.add(node.left);
                }
                if (node.right != null) {
                    cur.add(node.right);
                }
            }
            res.addFirst(valList);
            prev = cur;
        }
        return res;
    }
}
