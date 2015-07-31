/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void flatten(TreeNode root) {
        if (root != null) {
            flattenTree(root);
        }
    }

    private TreeNode flattenTree(TreeNode root) {
        TreeNode right = root.right, last = root;
        if (root.left != null) {
            last = flattenTree(root.left);
            last.right = root.right;
            root.right = root.left;
            last.left = root.left = null;
        }
        return right != null ? flattenTree(right) : last;
    }
}
