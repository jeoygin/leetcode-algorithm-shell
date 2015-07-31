/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; left = null; right = null; }
 * }
 */
import java.util.*;
public class Solution {
    public List<TreeNode> generateTrees(int n) {
        return generateTrees(1, n);
    }
    List<TreeNode> generateTrees(int low, int high) {
        if (low >= high) {
            return Arrays.asList(low == high ? new TreeNode(low) : null);
        }
        List<TreeNode> ret = new ArrayList<TreeNode>();
        for (int i = low; i <= high; i++) {
            List<TreeNode> leftList = generateTrees(low, i - 1);
            List<TreeNode> rightList = generateTrees(i + 1, high);
            for (TreeNode left: leftList) {
                for (TreeNode right: rightList) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    ret.add(root);
                }
            }
        }
        return ret;
    }
}
